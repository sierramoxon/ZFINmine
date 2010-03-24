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

/**
 * @author
 */
public class ZfinFeatureMarkerRelationshipsConverter extends BioFileConverter {

    private static final Logger LOG = Logger.getLogger(ZfinFeatureMarkerRelationshipsConverter.class);
    protected String organismRefId;

    private Map<String, Item> features = new HashMap();
    private Map<String, Item> genes = new HashMap();
    private Map<String, Item> constructs = new HashMap();
    private Set<String> synonyms = new HashSet();

    public ZfinFeatureMarkerRelationshipsConverter(ItemWriter writer, Model model)
            throws ObjectStoreException {
        super(writer, model, "ZFIN", "ZFIN Gene and Allele Data Set");

        // create and store organism
        Item organism = createItem("Organism");
        organism.setAttribute("taxonId", "7955");
        store(organism);
        organismRefId = organism.getIdentifier();
    }

    public void process(Reader reader) throws Exception {

        processFmrels(reader);

        try {
            for (Item feature : features.values()) {
                store(feature);
            }
        }
        catch (ObjectStoreException e) {
            throw new SAXException(e);
        }
    }

    public void processFmrels(Reader reader) throws Exception {

        Iterator lineIter = FormattedTextParser.parseDelimitedReader(reader, '|');

        while (lineIter.hasNext()) {
            String[] line = (String[]) lineIter.next();
            if (line.length < 2) {
                throw new RuntimeException("Line does not have enough elements: " + line.length + line[0]);
            }


            String relType = line[1];
            String featurePrimaryIdentifier = line[2];
            String markerPrimaryIdentifier = line[3];

            if (!StringUtils.isEmpty(featurePrimaryIdentifier)) {
                if (!StringUtils.isEmpty(markerPrimaryIdentifier)) {

                    Item feature = getFeature(featurePrimaryIdentifier);
                    Item marker = getTypedItem(markerPrimaryIdentifier);

                    if (relType.equals("is allele of")) {
                        System.out.println("substring is: " + markerPrimaryIdentifier.substring(6, 15).equals("CONSTRCT-"));
                        if (markerPrimaryIdentifier.substring(6, 15).equals("CONSTRCT-")) {


                            feature.addToCollection("insertionConstructs", marker);
                        } else {

                            feature.addToCollection("genes", marker);
                        }

                    }
                    if (relType.equals("contains innocuous sequence feature")) {

                        feature.addToCollection("innocuousConstructs", marker);
                    }
                    if (relType.equals("contains phenotypic sequence feature")) {

                        feature.addToCollection("phenotypicConstructs", marker);
                    }
                    //TODO: set synonym relationships
                    //TODO: set references.
                }
            }
        }
    }

    private Item getTypedItem(String primaryIdentifier)
            throws SAXException {

        Item typedItem = getConstruct(primaryIdentifier);

        if (primaryIdentifier.substring(0, 15).equals("ZDB-TGCONSTRCT-")) {
            typedItem = getConstruct(primaryIdentifier);
        }
        if (primaryIdentifier.substring(0, 15).equals("ZDB-GTCONSTRCT-")) {
            typedItem = getConstruct(primaryIdentifier);
        }
        if (primaryIdentifier.substring(0, 15).equals("ZDB-ETCONSTRCT-")) {
            typedItem = getConstruct(primaryIdentifier);
        }
        if (primaryIdentifier.substring(0, 9).equals("ZDB-GENE-")) {
            typedItem = getGene(primaryIdentifier);
        }
        return typedItem;
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

    private Item getConstruct(String primaryIdentifier)
            throws SAXException {
        Item item = constructs.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Construct");
            item.setReference("organism", organismRefId);
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            constructs.put(primaryIdentifier, item);
            try {
                store(item);
            }
            catch (ObjectStoreException e) {
                throw new SAXException(e);
            }
        }
        return item;
    }

    private Item getFeature(String primaryIdentifier)
            throws SAXException {
        Item item = features.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Feature");
            item.setReference("organism", organismRefId);
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            features.put(primaryIdentifier, item);
        }
        return item;
    }

    private Item getGene(String primaryIdentifier)
            throws SAXException {
        Item item = genes.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Gene");
            item.setReference("organism", organismRefId);
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            genes.put(primaryIdentifier, item);
            try {
                store(item);
            }
            catch (ObjectStoreException e) {
                throw new SAXException(e);
            }
        }
        return item;
    }


}
