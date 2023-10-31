package com.app.chars;

import org.junit.Test;

import static org.junit.Assert.*;

public class TotalCharsCounterTest {

    @Test
    public void testTotalCharsCount() {
        TotalCharsCounter lineCounter = new TotalCharsCounter();
        lineCounter.countLine("This is a test line");
        lineCounter.countLine("Another line för testing");
        assertEquals(43, lineCounter.getTotalChars());
    }
}

