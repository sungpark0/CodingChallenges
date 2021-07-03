package com.codingChallenge.WordPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {

    @Test
    void positiveTest() {
        assertTrue(WordPattern.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    void negativeTest() {
        assertFalse(WordPattern.wordPattern("abba", "dog cat fish cow"));
    }

}