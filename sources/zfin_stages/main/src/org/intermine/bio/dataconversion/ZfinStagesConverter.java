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
 * 
 * @author
 */
public class ZfinStagesConverter extends BioFileConverter
{
    //
    /**
     * Constructor
     * @param writer the ItemWriter used to handle the resultant items
     * @param model the Model
     */


    private static final Logger LOG = Logger.getLogger(ZfinStagesConverter.class);
    private Map<String, Item> stages = new HashMap();
    private Set<String> synonyms = new HashSet();


    public ZfinStagesConverter(ItemWriter writer, Model model) 
	throws ObjectStoreException {
        
	super(writer, model, "ZFIN", "ZFIN Stages Data Set");
    }

    /**
     * 
     *
     * {@inheritDoc}
     */
    public void process(Reader reader) throws Exception {

        File currentFile = getCurrentFile();

        if (currentFile.getName().equals("1stages.txt")) {
            processStages(reader);
        } else {
            throw new IllegalArgumentException("Unexpected file: " + currentFile.getName());
        }
	
    }

    public void processStages(Reader reader) throws Exception {

	Iterator lineIter = FormattedTextParser.parseDelimitedReader(reader,'|');

	while (lineIter.hasNext()) {
	    String[] line = (String[]) lineIter.next();

	    String primaryIdentifier = line[0];
	    String name = line[1];
	    String abbrev = line[2];
	    String startHour = line[3];
	    String endHour = line[4];
	    String oboId = line[5];

	    Item stage = getStage(primaryIdentifier);

	    if (!StringUtils.isEmpty(name)) {
		stage.setAttribute("name", name);
	    }
	    
            if (!StringUtils.isEmpty(abbrev)) {
                stage.setAttribute("stageAbbreviation", abbrev);
            }

            if (!StringUtils.isEmpty(startHour)) {
                stage.setAttribute("stageStartHour", startHour);
            }

            if (!StringUtils.isEmpty(endHour)) {
                stage.setAttribute("stageEndHour", endHour);
            }

            if (!StringUtils.isEmpty(oboId)) {
                stage.setAttribute("identifier", oboId);
            }

	    try {
		store(stage);
	    }
	    catch (ObjectStoreException e) {
		throw new SAXException(e);
	    }

	}
    }
    //TODO: move stage from OntologyTerm to ZFATerm, add merge for ZFATerm to keys file.
    private Item getStage(String primaryIdentifier)
	throws SAXException {
	Item item = stages.get(primaryIdentifier);
	if (item == null) {
	    item = createItem("ZFATerm");
	    item.setAttribute("primaryIdentifier", primaryIdentifier);

	    stages.put(primaryIdentifier, item);
	                                                                        
	}
	return item;
    }



}
