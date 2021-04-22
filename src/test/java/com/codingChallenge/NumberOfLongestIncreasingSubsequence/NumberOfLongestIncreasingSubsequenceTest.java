package com.codingChallenge.NumberOfLongestIncreasingSubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfLongestIncreasingSubsequenceTest {

    @Test
    void positiveTest() {
        assertEquals(2, NumberOfLongestIncreasingSubsequence.findNumberOfLIS(new int[]{1, 3, 5, 4, 7}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, NumberOfLongestIncreasingSubsequence.findNumberOfLIS(new int[]{2, 2, 2, 2, 2}));
    }
}