package com.codingChallenge.ValidAnagram;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @ParameterizedTest
    @ValueSource(strings = {"poop"})
    void positiveTest(String str1) {
        String str2 = "popo";
        assertTrue(ValidAnagram.isAnagram(str1, str2));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ham"})
    void negativeTest(String stringOne) {
        String stringTwo = "sam";
        assertFalse(ValidAnagram.isAnagram(stringOne, stringTwo));
    }

    @ParameterizedTest
    @ValueSource(strings = "police")
    void lengthNegativeTest(String stringOne) {
        String stringTwo = "polices";
        assertFalse(ValidAnagram.isAnagram(stringOne, stringTwo));
    }

    @Test
    void positiveTest() {
        assertTrue(ValidAnagram.isAnagramII("anagram", "nagaram"));
    }

    @Test
    void negativeTest() {
        assertFalse(ValidAnagram.isAnagramII("pig", "dig"));
    }
}