package com.codingChallenge.MinCostClimbingStairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    @Test
    void positiveTest() {
        assertEquals(6, MinCostClimbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(40, MinCostClimbingStairs.minCostClimbingStairs(new int[]{10, 15, 20, 10, 30}));
    }

}