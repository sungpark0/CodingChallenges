package com.codingChallenge.RomanToInteger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    void positiveTest() {
        assertEquals(58, RomanToInteger.romanToInt("LVIII"));
    }

    @Test
    void negativeTest() {
        assertNotEquals(100, RomanToInteger.romanToInt("III"));
    }

    @Test
    void positiveTestII() {
        assertEquals(1994, RomanToInteger.romanToIntIII("MCMXCIV"));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(5, RomanToInteger.romanToIntIII("VI"));
    }

}