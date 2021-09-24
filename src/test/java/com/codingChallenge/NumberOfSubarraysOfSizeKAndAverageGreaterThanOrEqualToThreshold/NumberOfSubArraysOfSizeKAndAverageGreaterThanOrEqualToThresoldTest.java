package com.codingChallenge.NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThresoldTest {

    @Test
    void positiveTest() {
        assertEquals(3, NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThresold
                .numOfSubarrays(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 3, 4)
        );
    }

    @Test
    void negativeTest() {
        assertNotEquals(4, NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThresold
                .numOfSubarrays(new int[]{1, 1, 1, 1, 1}, 1, 0)
        );
    }
}