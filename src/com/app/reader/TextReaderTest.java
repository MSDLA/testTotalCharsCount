package com.app.reader;

import org.junit.Test;
import static org.junit.Assert.*;

public class TextReaderTest {



        @Test
        public void testTextReaderWithStop() {
            TextReader textReader = new TextReader();
            LineCounter lineCounter = new LineCounter();

            textReader.processInput("Line 1");
            textReader.processInput("Line 2");
            textReader.processInput("Stop");

            assertEquals(0, lineCounter.getLineCount());
        }
    }




