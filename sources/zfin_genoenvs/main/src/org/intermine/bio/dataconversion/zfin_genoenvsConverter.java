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
import java.io.IOException;
import java.util.ArrayList;


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
 * @author
 */
public class zfin_genoenvsConverter extends BioDirectoryConverter {


    private static final Logger LOG = Logger.getLogger(zfin_genoenvsConverter.class);
    protected String organismRefId;
    private Map<String, Item> genos = new HashMap();
    private Map<String, Item> genoenvs = new HashMap();
    private Map<String, Item> envs = new HashMap();
    private Map<String, Item> pubs = new HashMap();
    private Set<String> synonyms = new HashSet();

    /**
     * Constructor
     *
     * @param writer the ItemWriter used to handle the resultant items
     * @param model  the Model
     */
    public zfin_genoenvsConverter(ItemWriter writer, Model model)
            throws ObjectStoreException {
        super(writer, model, "ZFIN", "ZFIN Curated Genotypes and Evironments Data Set");

        // create and store organism                                                                                         
        Item organism = createItem("Organism");
        organism.setAttribute("taxonId", "7955");
        store(organism);
        organismRefId = organism.getIdentifier();

    }


    public void process(File directory) throws Exception {

        try {
            File genoEnvsFile = new File(directory.getCanonicalPath() + "/1genoenvs.txt");
            processGenoEnvs(new FileReader(genoEnvsFile));
        } catch (IOException err) {
            throw new RuntimeException("error reading genoEnvsFile", err);
        }
        try {
            File envFile = new File(directory.getCanonicalPath() + "/2envs.txt");
            processEnvs(new FileReader(envFile));
        } catch (IOException err) {
            throw new RuntimeException("error reading envsFile", err);
        }


    }

    public void processGenoEnvs(Reader reader) throws Exception {

        Iterator lineIter = FormattedTextParser.parseDelimitedReader(reader, '|');

        while (lineIter.hasNext()) {
            String[] line = (String[]) lineIter.next();

            //System.out.println(line.length + line[0]);                                                                     
            if (line.length < 2) {
                throw new RuntimeException("Line does not have enough elements: " + line.length + line[0]);
            }

            String primaryIdentifier = line[0];
            String genoId = line[1];
            String envId = line[2];

            if (!StringUtils.isEmpty(primaryIdentifier)) {
                Item genotypeEnvironment = getGenoEnv(primaryIdentifier);

                if (!StringUtils.isEmpty(genoId)) {
                    genotypeEnvironment.setReference("genotype", getGenotype(genoId));
                }
                if (!StringUtils.isEmpty(envId)) {
                    genotypeEnvironment.setReference("environment", getEnv(envId));
                }

                try {
                    store(genotypeEnvironment);
                }
                catch (ObjectStoreException e) {
                    throw new SAXException(e);
                }
            }

        }

    }

    public void processEnvs(Reader reader) throws Exception {

        Iterator lineIter = FormattedTextParser.parseDelimitedReader(reader, '|');

        while (lineIter.hasNext()) {
            String[] line = (String[]) lineIter.next();
            //System.out.println(line[0]);                                                                                   

            System.out.println(line.length + line[0]);
            if (line.length < 2) {
                throw new RuntimeException("Line does not have enough elements: " + line.length + line[0]);
            }

            String primaryIdentifier = line[0];
            String name = line[1];
            String sourceId = line[2];

            if (!StringUtils.isEmpty(primaryIdentifier)) {
                Item env = getEnv(primaryIdentifier);
                if (!StringUtils.isEmpty(name)) {
                    env.setAttribute("name", name);
                }
                if (!StringUtils.isEmpty(sourceId)) {
                    env.setReference("publication", getPub(sourceId));
                }

                try {
                    store(env);
                }
                catch (ObjectStoreException e) {
                    throw new SAXException(e);
                }
            }
        }
    }

    private Item getGenoEnv(String primaryIdentifier)
            throws SAXException {
        Item item = genoenvs.get(primaryIdentifier);

        if (item == null) {
            item = createItem("GenotypeEnvironment");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            //item.setReference("organism", organismRefId);
            genoenvs.put(primaryIdentifier, item);
            //setSynonym(item.getIdentifier(), "identifier", primaryIdentifier);
            //setSynonym(primaryIdentifier, "accession", primaryIdentifier);
        }
        return item;
    }

    private Item getGenotype(String primaryIdentifier)
            throws SAXException {
        Item item = genos.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Genotype");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            item.setReference("organism", organismRefId);
            genos.put(primaryIdentifier, item);
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

    private Item getPub(String primaryIdentifier)
            throws SAXException {
        Item item = pubs.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Publication");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            //item.setReference("organism", organismRefId);
            pubs.put(primaryIdentifier, item);
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


    private Item getEnv(String primaryIdentifier)
            throws SAXException {
        Item item = envs.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Environment");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            //item.setReference("organism", organismRefId);
            envs.put(primaryIdentifier, item);
            //setSynonym(item.getIdentifier(), "identifier", primaryIdentifier);
            //setSynonym(primaryIdentifier, "accession", primaryIdentifier);

        }
        return item;
    }


}
