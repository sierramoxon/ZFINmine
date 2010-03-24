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

public class ZfinExpressionConverter extends BioFileConverter {

    private static final Logger LOG = Logger.getLogger(ZfinExpressionConverter.class);
    protected String organismRefId;
    private Map<String, Item> genes = new HashMap();
    private Map<String, Item> efgs = new HashMap();
    //private Map<String, Item> expressions = new HashMap();
    private Map<String, Item> results = new HashMap();
    private Map<String, Item> figures = new HashMap();
    private Map<String, Item> terms = new HashMap();
    private Map<String, Item> anatomies = new HashMap();
    private Map<String, Item> genotypeEnvironments = new HashMap();
    private Map<String, Item> publications = new HashMap();
    //private Map<String, Item> assays = new HashMap();
    private Set<String> synonyms = new HashSet();
    private Map<String, Item> dblinks = new HashMap();
    private Map<String, Item> atbs = new HashMap();
    private Map<String, Item> ESTs = new HashMap();

    /**
     * Constructor
     *
     * @param writer the ItemWriter used to handle the resultant items
     * @param model  the Model
     * @throws ObjectStoreException if an error occurs in storing
     */
    public ZfinExpressionConverter(ItemWriter writer, Model model)
            throws ObjectStoreException {
        super(writer, model, "ZFIN", "ZFIN Curated Expression Data Set");

        //create and store organism
        Item organism = createItem("Organism");
        organism.setAttribute("taxonId", "7955");
        store(organism);
        organismRefId = organism.getIdentifier();
    }

    public void process(Reader reader) throws Exception, SAXException {

        processXpatRes(reader);


        try {

            for (Item result : results.values()) {
                store(result);
            }
        } catch (ObjectStoreException e) {
                throw new SAXException(e);
            }
    }


    public void processXpatRes(Reader reader) throws Exception {
        Iterator lineIter = FormattedTextParser.parseDelimitedReader(reader, '|');

        while (lineIter.hasNext()) {
            String[] line = (String[]) lineIter.next();
            String xpatresId = line[0];
            //String xpatexId = line[1];
           // String anatitemZdb=line[2];
            //String startStgZdb=line[3];
            //String endStgZdb=line[4];
            String xpatFound = line[5];
            //6 xpatex comments
            //7 suggested anatomy
            //String subtermZdbId =line[8];
            String anatitem = line[9];
            String startStgId = line[10];
            String endStgId = line[11];
            //xpatex 12
            String publicationId = line[13];
            String expressionAssay = line[14];
            String estId = line[15];
            String genePrimaryIdentifier = line[16];
            //date 17
            String dblinkId = line[18];
            String genoxId = line[19];
            String atbId = line[20];
            String figId = line[21];
            //xaptfig_xpatres_id 22
            String subtermId = line[23];

            Item result = getResult(xpatresId);

            if (!StringUtils.isEmpty(genePrimaryIdentifier)) {

                if (genePrimaryIdentifier.substring(0, 9).equals("ZDB-GENE-")) {
                    Item gene = getGene(genePrimaryIdentifier);
                    result.setReference("gene", gene);
                } else {
                    Item gene = getEFG(genePrimaryIdentifier);
                    result.setReference("EFG", gene);
                }
            }
            if (!StringUtils.isEmpty(estId)) {
                result.setReference("probe", getEST(estId));
            }

            if (!StringUtils.isEmpty(genoxId)) {
                result.setReference("genotypeEnvironment", getGenotypeEnvironment(genoxId));
            }
            if (!StringUtils.isEmpty(expressionAssay)) {
                result.setAttribute("assay", expressionAssay);
            }
            if (!StringUtils.isEmpty(dblinkId)) {
                result.setReference("externalLink", getExternalLink(dblinkId));
            }
            if (!StringUtils.isEmpty(atbId)) {
                Item atb = getAtb(atbId);
                result.setReference("antibody", atb);

            }
            if (!StringUtils.isEmpty(publicationId)) {
                result.setReference("publication", getPublication(publicationId));
            }
            if (!StringUtils.isEmpty(anatitem)) {
                Item anatomy = getTerm(anatitem);
                result.setReference("anatomy", anatomy);
            }
            if (!StringUtils.isEmpty(subtermId)) {
                Item subterm = getTerm(subtermId);
                result.setReference("subterm", subterm);
            }
            if (!StringUtils.isEmpty(startStgId)) {
                Item startStg = getTerm(startStgId);
                result.setReference("startStage", startStg);
            }
            if (!StringUtils.isEmpty(endStgId)) {
                Item endStg = getTerm(endStgId);
                result.setReference("endStage", endStg);
            }
            if (!StringUtils.isEmpty(xpatFound)) {
                result.setAttribute("expressionFound", xpatFound);
            }
            if (!StringUtils.isEmpty(figId))
                result.addToCollection("figures", getFigure(figId));

   /*         try {
                store(result);
            } catch (ObjectStoreException e) {
                throw new SAXException(e);
            }*/
        

        }

    }



    private Item getPublication(String primaryIdentifier)
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

    private Item getTerm(String primaryIdentifier)
            throws SAXException {
        Item item = terms.get(primaryIdentifier);
        if (item == null) {
            String termType ="OntologyTerm";
            String prefix = primaryIdentifier.substring(0,3);
            if (prefix.equals("ZFA") || prefix.equals("ZFS")){
                termType="ZFATerm";
            }
            else if (prefix.equals("GO:")){
                termType="GOTerm";
            }
            else {
                LOG.info("ontologyterm created: "+primaryIdentifier);
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


    private Item getResult(String primaryIdentifier)
            throws SAXException {
        Item item = results.get(primaryIdentifier);
        if (item == null) {
            item = createItem("ExpressionResult");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
//item.setReference("organism", organismRefId);
            results.put(primaryIdentifier, item);
        }
        return item;
    }

    private Item getAtb(String primaryIdentifier)
            throws SAXException {
        Item item = atbs.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Antibody");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            atbs.put(primaryIdentifier, item);
            try {
                store(item);
            } catch (ObjectStoreException e) {
                throw new SAXException(e);
            }

        }

        return item;
    }

    private Item getEST(String primaryIdentifier)
            throws SAXException {
        Item item = ESTs.get(primaryIdentifier);
        if (item == null) {
            item = createItem("RNAClone");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            ESTs.put(primaryIdentifier, item);

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

    private Item getGene(String primaryIdentifier)
            throws SAXException {
        Item item = genes.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Gene");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            genes.put(primaryIdentifier, item);
            try {
                store(item);
            } catch (ObjectStoreException e) {
                throw new SAXException(e);
            }


        }
        return item;
    }

    private Item getEFG(String primaryIdentifier)
            throws SAXException {
        Item item = efgs.get(primaryIdentifier);
        if (item == null) {
            item = createItem("EFG");
            item.setReference("organism", organismRefId);
            efgs.put(primaryIdentifier, item);
            try {
                store(item);
            } catch (ObjectStoreException e) {
                throw new SAXException(e);
            }

        }
        return item;
    }

    private Item getExternalLink(String primaryIdentifier)
            throws SAXException {
        Item item = dblinks.get(primaryIdentifier);
        if (item == null) {
            item = createItem("ExternalLink");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            dblinks.put(primaryIdentifier, item);
            setSynonym(item.getIdentifier(), "identifier", primaryIdentifier);
            setSynonym(item.getIdentifier(), "accession", primaryIdentifier);

            try {
                store(item);
            } catch (ObjectStoreException e) {
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