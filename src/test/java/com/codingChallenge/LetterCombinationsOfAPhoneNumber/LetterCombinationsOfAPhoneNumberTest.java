package com.codingChallenge.LetterCombinationsOfAPhoneNumber;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfAPhoneNumberTest {

    @ParameterizedTest
    @ValueSource(strings = "23")
    void positiveTest(String str) {
        assertEquals(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), LetterCombinationsOfAPhoneNumber.letterCombinations(str));
    }

    @ParameterizedTest
    @ValueSource(strings = "9")
    void negativeTest(String str) {
        assertNotEquals(List.of("w", "x", "y"), LetterCombinationsOfAPhoneNumber.letterCombinations(str));
    }

    @Test
    void positiveTestII() {
        assertEquals(List.of("a", "b", "c"), LetterCombinationsOfAPhoneNumber.letterCombinations("2"));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(List.of("d", "e", "f"), LetterCombinationsOfAPhoneNumber.letterCombinations("34"));
    }

    @Test
    void positiveTestIII() {
        assertEquals(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), LetterCombinationsOfAPhoneNumber.letterCombinationsIII("23"));
    }

    @Test
    void negativeTestIII() {
        assertNotEquals(List.of("g", "e", "f"), LetterCombinationsOfAPhoneNumber.letterCombinationsIII("3"));
    }

}