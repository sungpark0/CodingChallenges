package com.codingChallenge.LargestNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {

    @Test
    void positiveTest() {
        assertEquals("210", LargestNumber.largestNumber(new int[]{10, 2}));
    }

    @Test
    void negativeTest() {
        assertNotEquals("1", LargestNumber.largestNumber(new int[]{10, 0}));
    }

}