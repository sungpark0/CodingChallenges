package com.codingChallenge.MinimumPathSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumPathSumTest {

    @Test
    void positiveTest() {
        int[][] test = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        assertEquals(7, MinimumPathSum.minPathSum(test));
    }

    @Test
    void negativeTest() {
        int[][] test = {{1, 2, 3}, {4, 5, 6}};
        assertNotEquals(16, MinimumPathSum.minPathSum(test));
    }

}