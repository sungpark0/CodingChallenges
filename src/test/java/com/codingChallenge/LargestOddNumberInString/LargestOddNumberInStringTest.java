package com.codingChallenge.LargestOddNumberInString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestOddNumberInStringTest {

    @Test
    void positiveTest() {
        assertEquals("5", LargestOddNumberInString.largestOddNumber("52"));
    }

    @Test
    void negativeTest() {
        assertNotEquals("0", LargestOddNumberInString.largestOddNumber("4206"));
    }
}