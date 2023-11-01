package person;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class LineCounterTest {

    @Test
    public void testLineCount() {
        LineCounter lineCounter = new LineCounter();
        lineCounter.countLine("Line 1");
        lineCounter.countLine("Line 2");
        lineCounter.countLine("Line 3");
        assertEquals(3, lineCounter.getLineCount());
    }
}


