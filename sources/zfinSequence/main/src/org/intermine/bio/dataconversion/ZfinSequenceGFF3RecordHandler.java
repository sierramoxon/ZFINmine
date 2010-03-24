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

import org.intermine.bio.io.gff3.GFF3Record;
import org.intermine.metadata.Model;
import org.intermine.xml.full.Item;

import org.apache.commons.lang.StringUtils;

/**
 * A converter/retriever for the ZfinSequence dataset via GFF files.
 */

public class ZfinSequenceGFF3RecordHandler extends GFF3RecordHandler
{

    /**
     * Create a new ZfinSequenceGFF3RecordHandler for the given data model.
     * @param model the model for which items will be created
     */
    public ZfinSequenceGFF3RecordHandler (Model model) {
        super(model);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void process(GFF3Record record) {

        Item feature = getFeature();

        String clsName = feature.getClassName();

        if ("Gene".equals(clsName)) {
            // move Gene.primaryIdentifier to Gene.secondaryIdentifier
            // move Gene.gene_id to Gene.primaryIdentifier
            feature.removeAttribute("primaryIdentifier");
 
            if (feature.getAttribute("primaryIdentifier") != null) {
                String secondary = feature.getAttribute("primaryIdentifier").getValue();
                feature.setAttribute("VegaId", secondary);
            }
            if (feature.getAttribute("symbol") != null) {
                if (record.getAttributes().get("gene_id") != null){
                    String primary = record.getAttributes().get("gene_id").toString();

                    feature.setAttribute("primaryIdentifier", primary);
                    feature.removeAttribute("symbol");
                }

            }
             if (record.getAttributes().get("Name") != null){
                String name = record.getAttributes().get("Name").toString();

                if (!StringUtils.isEmpty(name)){
                    feature.setAttribute("symbol",name);
                }
             }
        }
        if ("Transcript".equals(clsName)) {
            feature.removeAttribute("primaryIdentifier");

            if (feature.getAttribute("primaryIdentifier") != null) {
                String secondary = feature.getAttribute("primaryIdentifier").getValue();
                feature.setAttribute("VegaId", secondary);
            }
            if (feature.getAttribute("symbol") != null) {
                String primary = record.getAttributes().get("zdb_id").toString();
                feature.setAttribute("primaryIdentifier", primary);
                feature.removeAttribute("symbol");      
            }

            String name = record.getAttributes().get("Name").toString();
            if (!StringUtils.isEmpty(name)){
                feature.setAttribute("symbol",name);
            }
        }
        // This method is called for every line of GFF3 file(s) being read.  Features and their
        // locations are already created but not stored so you can make changes here.  Attributes
        // are from the last column of the file are available in a map with the attribute name as
        // the key.   For example:
        //
        //     Item feature = getFeature();
        //     String symbol = record.getAttributes().get("symbol");
        //     feature.setAttrinte("symbol", symbol);
        //
        // Any new Items created can be stored by calling addItem().  For example:
        // 
        //     String geneIdentifier = record.getAttributes().get("gene");
        //     gene = createItem("Gene");
        //     gene.setAttribute("primaryIdentifier", geneIdentifier);
        //     addItem(gene);
        //
        // You should make sure that new Items you create are unique, i.e. by storing in a map by
        // some identifier. 

    }

}
