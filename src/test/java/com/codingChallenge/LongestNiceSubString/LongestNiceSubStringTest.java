package com.codingChallenge.LongestNiceSubString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestNiceSubStringTest {

    @Test
    void positiveTest() {
        assertEquals("aAa", LongestNiceSubString.longestNiceSubstring("YazaAay"));
    }

    @Test
    void negativeTest() {
        assertNotEquals("Bb", LongestNiceSubString.longestNiceSubstring("Bbb"));
    }
}