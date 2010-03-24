package org.intermine.bio.dataconversion;

/*
 * Copyright (C) 2002-2010 FlyMine
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  See the LICENSE file for more
 * information or http://www.gnu.org/copyleft/lesser.html.
 *
 */

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.intermine.dataconversion.ItemsTestCase;
import org.intermine.dataconversion.MockItemWriter;
import org.intermine.metadata.Model;

public class ZfinExpressionConverterTest extends ItemsTestCase
{
    private ZfinExpressionConverter converter;
    private MockItemWriter itemWriter;

    public ZfinExpressionConverterTest(String arg) {
        super(arg);
    }

    public void setUp() throws Exception {

        itemWriter = new MockItemWriter(new HashMap());
        converter = new ZfinExpressionConverter(itemWriter, Model.getInstanceByName("genomic"));

        super.setUp();
    }

    public void testProcess() throws Exception {

        Reader reader = new InputStreamReader(getClass().getClassLoader().getResourceAsStream("2xpatres.txt"));
        System.out.println("***"+reader.toString());

        converter.process(reader);
        converter.close();

        // uncomment to write out a new target items file
        writeItemsFile(itemWriter.getItems(), "ZfinExpression-tgt-items.xml");

        Set expected = readItemSet("ZfinExpression-tgt-items.xml");

        assertEquals(expected, itemWriter.getItems());
    }
}
