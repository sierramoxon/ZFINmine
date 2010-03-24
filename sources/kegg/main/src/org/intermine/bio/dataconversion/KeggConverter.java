package org.intermine.bio.dataconversion;

/*
 * Copyright (C) 2002-2008 FlyMine
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  See the LICENSE file for more
 * information or http://www.gnu.org/copyleft/lesser.html.
 *
 */
import org.apache.commons.lang.StringUtils;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.intermine.dataconversion.ItemWriter;
import org.intermine.metadata.Model;
import org.intermine.objectstore.ObjectStoreException;
import org.intermine.util.FormattedTextParser;
import org.intermine.xml.full.Item;
import org.xml.sax.SAXException;
import org.apache.log4j.Logger;

public class KeggConverter extends BioFileConverter {
    protected static final Logger LOG = Logger.getLogger(KeggConverter.class);

    protected HashMap<String, Item> pathwayMap = new HashMap<String, Item>();
    private Map<String, Item> genes = new HashMap();
    private String taxonId = null;

    public KeggConverter(ItemWriter writer, Model model) {
        super(writer, model, "GenomeNet", "KEGG PATHWAY");
    }

    public void setTaxonId(String taxonId) {
        this.taxonId = taxonId;
    }

    public void process(Reader reader) throws Exception {
        if (taxonId == null || taxonId.equals("")) {
            throw new IllegalArgumentException("No taxonId provided: " + taxonId);
        }

        File currentFile = getCurrentFile();

        if (currentFile.getName().equals("map_title.tab")) {
            processMapTitleFile(reader);
        } else if (currentFile.getName().endsWith("zfixedKeggFile.txt")) {
            processGeneMapFile(reader);
        } else {
            System.out.println("Unexpected file: " + currentFile.getName());
        }
    }


    private void processMapTitleFile(Reader reader) throws IOException, ObjectStoreException, SAXException {
        Iterator lineIter = FormattedTextParser.parseTabDelimitedReader(reader);

        while (lineIter.hasNext()) {
            String[] line = (String[]) lineIter.next();
            String pathwayKey = line[0];
            String pathwayName = line[1];
            if (!StringUtils.isEmpty(pathwayKey)) {
                Item pathway = getPathway(pathwayKey);
                pathway.setAttribute("name", pathwayName);
                try {
                    store(pathway);
                } catch (ObjectStoreException e) {
                    throw new SAXException(e);
                }
            }
        }
    }

    private void processGeneMapFile(Reader reader) throws Exception {

        Iterator lineIter = FormattedTextParser.parseDelimitedReader(reader,'|');

        while (lineIter.hasNext()) {
            String[] line = (String[]) lineIter.next();
            String entrezId = line[0];
            String[] pathwayIds = line[4].split(" ");
            String geneId = line[2];
            Item gene = getGene(geneId);
            gene.setAttribute("secondaryIdentifier",entrezId);

            for (int i = 0; i < pathwayIds.length; i++) {
                //System.out.println("test "+geneId+" "+i);
                String pathwayId = pathwayIds[i];
                if(!StringUtils.isEmpty(pathwayId)){
                    //System.out.println("pathwayId found: "+pathwayId);
                    Item pathway = getPathway(pathwayId);
                    if (pathway == null){
                        System.out.println("pathway not found: "+geneId+" "+pathwayId);
                    }
                    gene.addToCollection("pathways", pathway);
                }
            }

            try {
                store(gene);
            } catch (ObjectStoreException e) {
                throw new SAXException(e);
            }
        }
    }

    private Item getGene(String geneId) throws SAXException{
        Item item = genes.get(geneId);
        if (item == null) {
            item = createItem("Gene");
            item.setAttribute("primaryIdentifier", geneId);
            genes.put(geneId, item);
        }
        return item;
    }

    private Item getPathway(String pathwayId) {
        Item pathway = pathwayMap.get(pathwayId);
        if (pathway == null) {
            pathway = createItem("Pathway");
            pathway.setAttribute("identifier", pathwayId);
            pathwayMap.put(pathwayId, pathway);
        }
        return pathway;
    }

}
