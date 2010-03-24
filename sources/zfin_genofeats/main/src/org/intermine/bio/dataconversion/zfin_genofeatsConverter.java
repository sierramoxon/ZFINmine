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

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.intermine.dataconversion.ItemWriter;
import org.intermine.metadata.Model;
import org.intermine.objectstore.ObjectStoreException;
import org.intermine.util.FormattedTextParser;
import org.intermine.xml.full.Item;
import org.xml.sax.SAXException;

public class zfin_genofeatsConverter extends BioFileConverter {

    private static final Logger LOG = Logger.getLogger(zfin_genofeatsConverter.class);
    protected String organismRefId;
    private Map<String, Item> genofeats = new HashMap();
    private Map<String, Item> features = new HashMap();
    private Map<String, Item> genotypes = new HashMap();
    private Set<String> synonyms = new HashSet();

    /**
     * Constructor
     *
     * @param writer the ItemWriter used to handle the resultant items
     * @param model  the Model
     * @throws ObjectStoreException if an error occurs in storing
     */
    public zfin_genofeatsConverter(ItemWriter writer, Model model)
            throws ObjectStoreException {
        super(writer, model, "ZFIN", "ZFIN Curated Alleles and Genotypes Data Set");

        // create and store organism
        Item organism = createItem("Organism");
        organism.setAttribute("taxonId", "7955");
        store(organism);
        organismRefId = organism.getIdentifier();
    }

    public void process(Reader reader) throws Exception {

        File currentFile = getCurrentFile();

        if (currentFile.getName().equals("1genofeats.txt")) {
            processGenoFeats(reader);
        } else {
            throw new IllegalArgumentException("Unexpected file: " + currentFile.getName());
        }

    }

    public void processGenoFeats(Reader reader) throws Exception {

        Iterator lineIter = FormattedTextParser.parseDelimitedReader(reader, '|');

        while (lineIter.hasNext()) {
            String[] line = (String[]) lineIter.next();

            String primaryIdentifier = line[0];
            String genoId = line[1];
            String featureId = line[2];
            String featureZygosity = line[3];

            Item genofeat = getGenotypeFeature(primaryIdentifier);

            if (!StringUtils.isEmpty(genoId)) {
                genofeat.setReference("genotype", getGenotype(genoId));
            }
            if (!StringUtils.isEmpty(featureId)) {
                genofeat.setReference("feature", getFeature(featureId));
            }
            if (!StringUtils.isEmpty(featureZygosity)) {
                genofeat.setAttribute("featureZygosity", featureZygosity);
            }

            try {
                store(genofeat);
            } catch (ObjectStoreException e) {
                throw new SAXException(e);
            }

        }
    }

    private Item getGenotypeFeature(String primaryIdentifier)
            throws SAXException {
        Item item = genofeats.get(primaryIdentifier);
        if (item == null) {
            item = createItem("GenotypeFeature");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            genofeats.put(primaryIdentifier, item);
            //setSynonym(item.getIdentifier(), "identifier", primaryIdentifier);
            //setSynonym(primaryIdentifier, "accession", primaryIdentifier);
        }
        return item;
    }

    private Item getFeature(String primaryIdentifier)
            throws SAXException {
        Item item = features.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Feature");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            features.put(primaryIdentifier, item);
            //setSynonym(item.getIdentifier(), "identifier", primaryIdentifier);                          
            //setSynonym(primaryIdentifier, "accession", primaryIdentifier);                              
            try {
                store(item);
            }
            catch (ObjectStoreException e) {
                throw new SAXException(e);
            }
        }

        return item;
    }

    private Item getGenotype(String primaryIdentifier)
            throws SAXException {
        Item item = genotypes.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Genotype");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            genotypes.put(primaryIdentifier, item);

            try {
                store(item);
            }
            catch (ObjectStoreException e) {
                throw new SAXException(e);
            }

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
