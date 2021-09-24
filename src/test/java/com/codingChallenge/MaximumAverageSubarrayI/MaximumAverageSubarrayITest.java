package com.codingChallenge.MaximumAverageSubarrayI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayITest {

    @Test
    void positiveTest() {
        assertEquals(12.75, MaximumAverageSubarrayI.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

    @Test
    void negativeTest() {
        assertNotEquals(0, MaximumAverageSubarrayI.findMaxAverage(new int[]{-1}, 1));
    }
}