package com.codingChallenge.MatrixDiagonalSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixDiagonalSumTest {

    @Test
    void positiveTest() {
        int[][] test = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        assertEquals(8, MatrixDiagonalSum.diagonalSum(test));
    }

    @Test
    void negativeTest() {
        int[][] test = {{5}};
        assertNotEquals(2, MatrixDiagonalSum.diagonalSum(test));
    }

}