package com.codingChallenge.MinimumFallingPathSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumFallingPathSumTest {

    @Test
    void positiveTest() {
        int[][] test = new int[][]{{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        assertEquals(13, MinimumFallingPathSum.minFallingPathSum(test));
    }

    @Test
    void negativeTest() {
        int[][] falseTest = new int[][]{{-19, 57}, {-40, -5}};
        assertNotEquals(52, MinimumFallingPathSum.minFallingPathSum(falseTest));
    }

}