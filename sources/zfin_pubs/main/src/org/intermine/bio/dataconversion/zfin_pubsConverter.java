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
public class zfin_pubsConverter extends BioFileConverter {
    //
    /**
     * Constructor
     *
     * @param writer the ItemWriter used to handle the resultant items
     * @param model the Model
     */


    private static final Logger LOG = Logger.getLogger(zfin_pubsConverter.class);
    private Map<String, Item> pubs = new HashMap();
    private Map<String, Item> journals = new HashMap();
    private Set<String> synonyms = new HashSet();


    public zfin_pubsConverter(ItemWriter writer, Model model)
            throws ObjectStoreException {

        super(writer, model, "ZFIN", "ZFIN Publications Data Set");
    }

    public void process(Reader reader) throws Exception {

        processPubs(reader);

        try {
            for (Item pub : pubs.values()) {
                store(pub);
            }
        }
        catch (ObjectStoreException e) {
            throw new SAXException(e);
        }

    }


    public void processPubs(Reader reader) throws Exception {

        Iterator lineIter = FormattedTextParser.parseDelimitedReader(reader, '|');

        while (lineIter.hasNext()) {
            String[] line = (String[]) lineIter.next();
            //System.out.println(line.length + line[0]);
            if (line.length < 9) {
                throw new RuntimeException("Line does not have enough elements: " + line.length + line[0]);
            }

            String primaryIdentifier = line[0];
            String authorNames = line[1];
            String title = line[2];
            String pubAbstract = line[3];
            String pubMedId = line[4];
            String type = line[5];
            String journal = line[6];
            String doi = line[7];
            String volume = line[8];
            String pages = line[9];


            Item pub = getPub(primaryIdentifier);

            if (!StringUtils.isEmpty(authorNames)) {
                pub.setAttribute("authorNames", authorNames);
            }
            if (!StringUtils.isEmpty(title)) {
                pub.setAttribute("title", title);
            }
            if (!StringUtils.isEmpty(pubAbstract)) {
                pub.setAttribute("pubAbstract", pubAbstract);
            }
            if (!StringUtils.isEmpty(pubMedId)) {
                pub.setAttribute("pubMedId", pubMedId);
            }
            if (!StringUtils.isEmpty(type)) {
                pub.setAttribute("type", type);
            }
            if (!StringUtils.isEmpty(type)) {
                pub.setReference("journal", getJournal(journal));
            }
            if (!StringUtils.isEmpty(doi)) {
                pub.setAttribute("doi", doi);
            }
            if (!StringUtils.isEmpty(volume)) {
                pub.setAttribute("volume", volume);
            }
            if (!StringUtils.isEmpty(pages)) {
                pub.setAttribute("pages", pages);
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
            //setSynonym(primaryIdentifier, "primaryIdentifier", primaryIdentifier);
        }
        return item;
    }

    private Item getJournal(String primaryIdentifier)
            throws SAXException {
        Item item = journals.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Journal");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            journals.put(primaryIdentifier, item);
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

}
