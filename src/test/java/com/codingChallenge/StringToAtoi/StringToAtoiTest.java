package com.codingChallenge.StringToAtoi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToAtoiTest {

    @Test
    void positiveTest() {
        assertEquals(42, StringToAtoi.myAtoi("42"));
    }

    @Test
    void negativeTest() {
        assertNotEquals(41930, StringToAtoi.myAtoi("4193 with words"));
    }

}