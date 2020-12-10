package com.rootbyos.springboot.GreatestCommonDivisorOfStrings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorOfStringsTest {

    @ParameterizedTest
    @ValueSource(strings = "ABCABCABC")
    void positiveTest(String str) {
        assertEquals("ABC", GreatestCommonDivisorOfStrings.gcdOfStrings(str, "ABC"));
    }

    @ParameterizedTest
    @ValueSource(strings = "CATBATCAT")
    void negativeTest(String str) {
        assertNotEquals("CAT", GreatestCommonDivisorOfStrings.gcdOfStrings(str, "CAT"));
    }

}