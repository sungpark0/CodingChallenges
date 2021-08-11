package com.codingChallenge.CountBinarySubstrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountBinarySubstringsTest {

    @Test
    void positiveTest() {
        assertEquals(6, CountBinarySubstrings.countBinarySubstrings("00110011"));
    }

    @Test
    void negativeTest() {
        assertNotEquals(2, CountBinarySubstrings.countBinarySubstrings("10101"));
    }

    @Test
    void positiveTestII() {
        assertEquals(4, CountBinarySubstrings.countBinarySubstrings("001100"));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(1, CountBinarySubstrings.countBinarySubstrings("101"));
    }

}