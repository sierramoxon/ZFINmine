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
public class ZfinJournalsConverter extends BioFileConverter {


    private static final Logger LOG = Logger.getLogger(ZfinJournalsConverter.class);
    protected String organismRefId;
    private Map<String, Item> pubs = new HashMap();
    private Map<String, Item> journals = new HashMap();
    private Set<String> synonyms = new HashSet();

    /*
     * Constructor
     * @param writer the ItemWriter used to handle the resultant items
     * @param model the Model
     */
    public ZfinJournalsConverter(ItemWriter writer, Model model)
            throws ObjectStoreException {
        super(writer, model, "ZFIN", "ZFIN Journal Data Set");

    }

    public void process(Reader reader) throws Exception {


        processJournals(reader);

    }

    public void processJournals(Reader reader) throws Exception {

        Iterator lineIter = FormattedTextParser.parseDelimitedReader(reader, '|');

        while (lineIter.hasNext()) {
            String[] line = (String[]) lineIter.next();

            if (line.length < 2) {
                throw new RuntimeException("Journal line does not have enough elements: " + line.length + line[0]);
            }

            String primaryIdentifier = line[0];
            String name = line[1];
            String abbrev = line[2];
            String publisher = line[3];

            Item journal = getJournal(primaryIdentifier);


            if (!StringUtils.isEmpty(name)) {
                journal.setAttribute("name", name);
            }
            if (!StringUtils.isEmpty(abbrev)) {
                journal.setAttribute("abbrev", abbrev);
            }
            if (!StringUtils.isEmpty(publisher)) {
                journal.setAttribute("publisher", publisher);
            }

            if (journal.getAttribute("primaryIdentifier").getValue().equals("ZDB-JRNL-050621-1000")) {
                System.out.println("storing: ZDB-JRNL-050621-1000");
            }

            try {

                store(journal);
            }
            catch (ObjectStoreException e) {
                throw new SAXException(e);
            }
        }
    }

    private Item getJournal(String primaryIdentifier)
            throws SAXException {
        Item item = journals.get(primaryIdentifier);
        if (item == null) {
            item = createItem("Journal");
            item.setAttribute("primaryIdentifier", primaryIdentifier);
            //item.setReference("organism", organismRefId);
            journals.put(primaryIdentifier, item);
            setSynonym(item.getIdentifier(), "identifier", primaryIdentifier);
            setSynonym(item.getIdentifier(), "accession", primaryIdentifier);
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

