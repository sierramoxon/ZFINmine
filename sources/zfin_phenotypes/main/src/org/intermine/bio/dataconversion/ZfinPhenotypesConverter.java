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
 * parse and load atomic_phenotype table and apato_figure table.
 * assumes ontology zdb-ids have been converted to obo ids.
 */
public class ZfinPhenotypesConverter extends BioFileConverter {

    private static final Logger LOG = Logger.getLogger(ZfinPhenotypesConverter.class);
    protected String organismRefId;
    private Map<String, Item> apatos = new HashMap();
    private Map<String, Item> figures = new HashMap();
    private Map<String, Item> stages = new HashMap();
    private Map<String, Item> terms = new HashMap();
    private Map<String, Item> genotypeEnvironments = new HashMap();
    private Map<String, Item> publications = new HashMap();
    private Set<String> synonyms = new HashSet();
    private Map<String, Item> qualityTerms = new HashMap();

    /**
     * Constructor
     *
     * @param writer the ItemWriter used to handle the resultant items
     * @param model  the Model
     */
    public ZfinPhenotypesConverter(ItemWriter writer, Model model)
            throws ObjectStoreException {
        super(writer, model, "ZFIN", "ZFIN Curated Phenotype Data Set");

        //create and store organism
        Item organism = createItem("Organism");
        organism.setAttribute("taxonId", "7955");
        store(organism);
        organismRefId = organism.getIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    public void process(Reader reader) throws Exception {

        File currentFile = getCurrentFile();

        if (currentFile.getName().equals("1apato.txt")) {
            processApato(reader);

        } else if (currentFile.getName().equals("2apatofig.txt")) {
            processApatoFig(reader);

        } else {
            throw new IllegalArgumentException("Unexpected file: " + currentFile.getName());
        }
    }

    public void close() throws SAXException {

        try {
            for (Item apato : apatos.values()) {
                store(apato);
            }
        }
        catch (ObjectStoreException e) {
            throw new SAXException(e);
        }
    }

    public void processApato(Reader reader) throws Exception, SAXException {
        Iterator lineIter = FormattedTextParser.parseDelimitedReader(reader, '|');

        while (lineIter.hasNext()) {
            String[] line = (String[]) lineIter.next();
            String apatoId = line[0];
            String genoxId = line[1];
            String supertermId = line[2];
            String subtermId = line[3];
            String startStgId = line[4];
            String endStgId = line[5];
            String pubId = line[6];
            String tag = line[7];
            String qualityId = line[8];

            Item apato = getApato(apatoId);

            if (!StringUtils.isEmpty(genoxId)) {
                Item genox = getGenotypeEnvironment(genoxId);
                apato.setReference("genotypeEnvironment", genox);
            }
            if (!StringUtils.isEmpty(supertermId)) {
                Item superTerm = getTerm(supertermId);
                apato.setReference("superTerm", superTerm);
            }
            if (!StringUtils.isEmpty(subtermId)) {
                Item subTerm = getTerm(subtermId);
                apato.setReference("subTerm", subTerm);
            }

            if (!StringUtils.isEmpty(pubId)) {
                Item pub = getPub(pubId);
                apato.setReference("publication", pub);
            }
            if (!StringUtils.isEmpty(startStgId)) {
                Item startStg = getStage(startStgId);
                apato.setReference("startStage", startStg);
            }
            if (!StringUtils.isEmpty(endStgId)) {
                Item endStage = getStage(endStgId);
                apato.setReference("endStage", endStage);
            }
            if (!StringUtils.isEmpty(qualityId)) {
                Item quality = getQTerm(qualityId);
                apato.setReference("phenotypeTerm", quality);
            }
            if (!StringUtils.isEmpty(tag)) {
                apato.setAttribute("tag", tag);
            }

        }
    }

    public void processApatoFig(Reader reader) throws Exception, SAXException {
        Iterator lineIter = FormattedTextParser.parseDelimitedReader(reader, '|');

        while (lineIter.hasNext()) {
            String[] line = (String[]) lineIter.next();

            String apatoId = line[0];
            String apatofigId = line[1];

            if (!StringUtils.isEmpty(apatoId) && !StringUtils.isEmpty(apatofigId)) {
                Item apato = getApato(apatoId);
                Item fig = getFigure(apatofigId);

                apato.addToCollection("figures", fig);

            }
        }
    }

    private Item getPub(String primaryIdentifier)
            throws SAXException {
        Item item = publications.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Publication");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            publications.put(primaryIdentifier, item);
            try {
                store(item);
            } catch (ObjectStoreException e) {
                throw new SAXException(e);
            }
        }
        return item;
    }

    private Item getQTerm(String identifier)
            throws SAXException {
        Item item = terms.get(identifier);
        if (item == null) {
            item = createItem("PATOTerm");
            item.setAttribute("identifier", identifier);
            terms.put(identifier, item);
            try {
                store(item);
            } catch (ObjectStoreException e) {
                throw new SAXException(e);
            }
        }
        return item;
    }

    private Item getFigure(String primaryIdentifier)
            throws SAXException {
        Item item = figures.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Figure");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            figures.put(primaryIdentifier, item);
            try {
                store(item);
            } catch (ObjectStoreException e) {
                throw new SAXException(e);
            }
        }
        return item;
    }

    private Item getStage(String identifier)
            throws SAXException {
        Item item = terms.get(identifier);
        if (item == null) {
            item = createItem("OntologyTerm");
            item.setAttribute("identifier", identifier);
            terms.put(identifier, item);
            try {
                store(item);
            } catch (ObjectStoreException e) {
                throw new SAXException(e);
            }
        }
        return item;
    }

    private Item getTerm(String primaryIdentifier) throws SAXException {
        Item item = terms.get(primaryIdentifier);
        if (item == null) {
            String termType = "OntologyTerm";
            String prefix = primaryIdentifier.substring(0, 3);
            if (prefix.equals("ZFA") || prefix.equals("ZFS")) {
                termType = "ZFATerm";
            } else if (prefix.equals("GO:")) {
                termType = "GOTerm";
            } else {
                LOG.info("ontologyterm created: " + primaryIdentifier);
            }
            item = createItem(termType);
            item.setAttribute("identifier", primaryIdentifier);
            terms.put(primaryIdentifier, item);
            try {
                store(item);
            } catch (ObjectStoreException e) {
                throw new SAXException(e);
            }
        }
        return item;
    }

    private Item getGenotypeEnvironment(String primaryIdentifier)
            throws SAXException {
        Item genox2 = genotypeEnvironments.get(primaryIdentifier);
        if (genox2 == null) {
            genox2 = createItem("GenotypeEnvironment");
            genox2.setAttribute("primaryIdentifier", primaryIdentifier);
            genotypeEnvironments.put(primaryIdentifier, genox2);
            try {
                store(genox2);
            } catch (ObjectStoreException e) {
                throw new SAXException(e);
            }

        }
        return genox2;
    }

    private Item getApato(String primaryIdentifier)
            throws SAXException {
        Item item = apatos.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Phenotype");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            apatos.put(primaryIdentifier, item);
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
