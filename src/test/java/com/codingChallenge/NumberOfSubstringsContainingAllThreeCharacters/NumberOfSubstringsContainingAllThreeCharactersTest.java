package com.codingChallenge.NumberOfSubstringsContainingAllThreeCharacters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfSubstringsContainingAllThreeCharactersTest {

    @Test
    void positiveTest() {
        assertEquals(10, NumberOfSubstringsContainingAllThreeCharacters.numberOfSubstrings("abcabc"));
    }

    @Test
    void negativeTest() {
        assertNotEquals(2, NumberOfSubstringsContainingAllThreeCharacters.numberOfSubstrings("aaacb"));
    }
}