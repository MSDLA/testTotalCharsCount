package com.app.chars;

public class TotalCharsCounter {
    private int totalChars;

    public void countLine(String line) {
        totalChars += line.length();
    }

    public int getTotalChars() {
        return totalChars;
    }

}
