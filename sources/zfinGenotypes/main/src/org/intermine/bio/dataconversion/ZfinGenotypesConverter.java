package org.intermine.bio.dataconversion;

/*
 * Copyright (C) 2002-2009 FlyMine
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  See the LICENSE file for more
 * information or http://www.gnu.org/copyleft/lesser.html.
 *
 */

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.intermine.dataconversion.ItemWriter;
import org.intermine.metadata.Model;
import org.intermine.objectstore.ObjectStoreException;
import org.intermine.util.FormattedTextParser;
import org.intermine.xml.full.Item;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.Reader;
import java.util.*;

public class ZfinGenotypesConverter extends BioFileConverter {

    private static final Logger LOG = Logger.getLogger(ZfinGenotypesConverter.class);
    protected String organismRefId;
    private Map<String, Item> genotypes = new HashMap();
    private Set<String> synonyms = new HashSet();

    /**
     * Constructor
     *
     * @param writer the ItemWriter used to handle the resultant items
     * @param model  the Model
     * @throws ObjectStoreException if an error occurs in storing
     */
    public ZfinGenotypesConverter(ItemWriter writer, Model model)
            throws ObjectStoreException {
        super(writer, model, "ZFIN", "ZFIN Curated Genotypes Data Set");

        // create and store organism
        Item organism = createItem("Organism");
        organism.setAttribute("taxonId", "7955");
        store(organism);
        organismRefId = organism.getIdentifier();
    }

    public void process(Reader reader) throws Exception {

        File currentFile = getCurrentFile();

        if (currentFile.getName().equals("1genos.txt")) {
            processGenotypes(reader);
        } else {
            throw new IllegalArgumentException("Unexpected file: " + currentFile.getName());
        }
        try {

            for (Item geno : genotypes.values()) {
                store(geno);
            }
        } catch (ObjectStoreException e) {
            throw new SAXException(e);
        }

    }


    public void processGenotypes(Reader reader) throws Exception {

        Iterator lineIter = FormattedTextParser.parseDelimitedReader(reader, '|');

        while (lineIter.hasNext()) {
            String[] line = (String[]) lineIter.next();

            String primaryIdentifier = line[0];
            String genoDisplayName = line[1];
            String genoHandle = line[2];
            String isWildType = line[6];
            String isExtinct = line[7];

            String parentalZygocity = line[9];
            String genoBackgrounds = line[10];

            Item genotype = getGenotype(primaryIdentifier);

            if (!StringUtils.isEmpty(parentalZygocity)) {
                genotype.setAttribute("genoDisplayName", genoDisplayName);
            }
            if (!StringUtils.isEmpty(parentalZygocity)) {
                genotype.setAttribute("genoHandle", genoHandle);
            }
            if (!StringUtils.isEmpty(isWildType)) {
                genotype.setAttribute("isWildType", isWildType);
            }
            if (!StringUtils.isEmpty(isExtinct)) {
                genotype.setAttribute("isExtinct", isExtinct);
            }
            if (!StringUtils.isEmpty(genoDisplayName)) {
                genotype.setAttribute("genoDisplayName", genoDisplayName);
            }
            if (!StringUtils.isEmpty(parentalZygocity)) {
                genotype.setAttribute("parentalZygocity", parentalZygocity);
            }
            if (!StringUtils.isEmpty(parentalZygocity)) {
                genotype.setAttribute("backgrounds", genoBackgrounds);
            }

        }
    }


    private Item getGenotype(String primaryIdentifier)
            throws SAXException {
        Item item = genotypes.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Genotype");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            item.setReference("organism", organismRefId);
            genotypes.put(primaryIdentifier, item);
            setSynonym(item.getIdentifier(), "identifier", primaryIdentifier);
            setSynonym(item.getIdentifier(), "accession", primaryIdentifier);
        }
        return item;
    }

    private void setSynonym(String subjectRefId, String type, String value)
            throws SAXException {
        String key = subjectRefId + type + value;
        if (!synonyms.contains(key)) {
            Item synonym = createItem("Synonym");
            synonym.setAttribute("type", type);
            synonym.setAttribute("value", value);
            synonym.setReference("subject", subjectRefId);
            synonyms.add(key);
            try {
                store(synonym);
            } catch (ObjectStoreException e) {
                throw new SAXException(e);
            }
        }
    }

}
