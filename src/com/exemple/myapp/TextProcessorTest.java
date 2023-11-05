package com.exemple.myapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



    public class TextProcessorTest {
        private TextProcessor textProcessor;

        @BeforeEach
        public void setUp() {
            textProcessor = new TextProcessor();
        }


        @Test
        public void testProcessTextWithSampleText() {
            String inputText = "This is a sample text with multiple words.";
            String result = textProcessor.processText(inputText);

            // Assertion för att kontrollera om resultatet innehåller ett visst ord
            assertTrue(result.contains("sample"));

            // Assertion för att kontrollera om resultatet innehåller rätt antal ord
            assertEquals(8, result.split(" ").length);
        }

        @Test
        public void testProcessTextWithStopWord() {
            String inputText = "Testing stop word\nAnother line of text\nstop";
            String result = textProcessor.processText(inputText);

            // Assertion för att kontrollera om resultatet inte innehåller ordet "stop"
            assertFalse(result.contains("stop"));
        }

        @Test
        public void testProcessTextWithLongerText() {
            String inputText = "Short text\nA much longer sentence\nYet another line of text\n";
            String result = textProcessor.processText(inputText);

            // Assertion för att kontrollera om resultatet innehåller längsta ordet
            assertTrue(result.contains("longer"));





        }
    }


