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
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.intermine.dataconversion.ItemWriter;
import org.intermine.metadata.Model;
import org.intermine.xml.full.Item;
import org.intermine.objectstore.ObjectStoreException;
import org.intermine.util.FormattedTextParser;
import org.apache.log4j.Logger;
import org.apache.commons.lang.StringUtils;
import org.xml.sax.SAXException;


/**
 * @author
 */
public class ZfinFiguresConverter extends BioFileConverter {
    //
    private static final String DATASET_TITLE = "ZFIN Figures Data Set";
    private static final String DATA_SOURCE_NAME = "ZFIN";
    private Map<String, Item> pubs = new HashMap();
    private Map<String, Item> figs = new HashMap();
    private Set<String> synonyms = new HashSet();

    /**
     * Constructor
     *
     * @param writer the ItemWriter used to handle the resultant items
     * @param model  the Model
     */
    public ZfinFiguresConverter(ItemWriter writer, Model model) throws ObjectStoreException {
        super(writer, model, DATA_SOURCE_NAME, DATASET_TITLE);

    }


    public void process(Reader reader) throws Exception {

        processFigures(reader);
    }

    private void processFigures(Reader reader) throws Exception {
        Iterator lineIter = FormattedTextParser.parseDelimitedReader(reader, '|');

        while (lineIter.hasNext()) {
            String[] line = (String[]) lineIter.next();
            if (line.length < 3) {
                throw new RuntimeException("Line does not have enough elements: " + line.length + line[0]);
            }

            String primaryIdentifier = line[0];
            String label = line[1];
            String caption = line[2];
            String pubPrimaryIdentifier = line[3];

            Item pub = getPub(pubPrimaryIdentifier);
            Item fig = getFigure(primaryIdentifier);

            if (!StringUtils.isEmpty(label)) {
                fig.setAttribute("label", label);
            }
            if (!StringUtils.isEmpty(caption)) {
                fig.setAttribute("caption", caption);
            }
            if (!StringUtils.isEmpty(pubPrimaryIdentifier)) {
                fig.setReference("publication", pub);
            }

            try {

                store(fig);
            }
            catch (ObjectStoreException e) {
                throw new SAXException(e);
            }
        }
    }

    private Item getPub(String primaryIdentifier)
            throws SAXException {
        Item item = pubs.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Publication");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            //item.setReference("organism", organismRefId);
            pubs.put(primaryIdentifier, item);
            setSynonym(item.getIdentifier(), "identifier", primaryIdentifier);
            setSynonym(item.getIdentifier(), "accession", primaryIdentifier);
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

    private Item getFigure(String primaryIdentifier)
            throws SAXException {
        Item item = figs.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Figure");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            figs.put(primaryIdentifier, item);
        }
        return item;
    }
}
