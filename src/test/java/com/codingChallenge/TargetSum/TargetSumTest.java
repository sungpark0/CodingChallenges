package com.codingChallenge.TargetSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetSumTest {

    @Test
    void positiveTest() {
        assertEquals(5, TargetSum.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }

    @Test
    void negativeTest() {
        assertNotEquals(0, TargetSum.findTargetSumWays(new int[]{1}, 1));
    }

}