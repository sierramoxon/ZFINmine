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
import org.intermine.dataconversion.FileConverter;
import org.intermine.objectstore.ObjectStoreException;
import org.intermine.util.FormattedTextParser;
import org.intermine.xml.full.Item;
import org.xml.sax.SAXException;

/**
 * DataConverter to load ZFIN feature identifiers from text files
 */
public class ZfinFeaturesConverter extends BioFileConverter {

    private static final Logger LOG = Logger.getLogger(ZfinFeaturesConverter.class);
    protected String organismRefId;
    private Map<String, Item> features = new HashMap();
    private Set<String> synonyms = new HashSet();

    /**
     * Constructor
     *
     * @param writer the ItemWriter used to handle the resultant items
     * @param model  the Model
     * @throws ObjectStoreException if an error occurs in storing
     */
    public ZfinFeaturesConverter(ItemWriter writer, Model model)
            throws ObjectStoreException {
        super(writer, model, "ZFIN", "ZFIN Alleles and Transgenics Data Set");

        // create and store organism
        Item organism = createItem("Organism");
        organism.setAttribute("taxonId", "7955");
        store(organism);
        organismRefId = organism.getIdentifier();
    }

    public void process(Reader reader) throws Exception {

        File currentFile = getCurrentFile();

        if (currentFile.getName().equals("2features.txt")) {
            processFeatures(reader);
        } else {
            throw new IllegalArgumentException("Unexpected file: " + currentFile.getName());
        }

    }


    /**
     * <p/>
     * {@inheritDoc}
     */
    public void processFeatures(Reader reader) throws Exception {

        Iterator lineIter = FormattedTextParser.parseDelimitedReader(reader, '|');

        while (lineIter.hasNext()) {
            String[] line = (String[]) lineIter.next();

            String primaryIdentifier = line[0];
            String name = line[1];
            String abbrev = line[2];
            String type = line[3];
            Item feature = getFeature(primaryIdentifier);

            if (!StringUtils.isEmpty(name)) {
                feature.setAttribute("featureName", name);
            }
            if (!StringUtils.isEmpty(abbrev)) {
                feature.setAttribute("featureAbbrev", abbrev);
            }
            if (!StringUtils.isEmpty(type)) {
                feature.setAttribute("type", type);
            }

            try {
                store(feature);
            } catch (ObjectStoreException e) {
                throw new SAXException(e);
            }

        }
    }

    public void close()
            throws SAXException {
    }

    private Item getFeature(String primaryIdentifier)
            throws SAXException {
        Item item = features.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Feature");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            item.setReference("organism", organismRefId);
            features.put(primaryIdentifier, item);
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
