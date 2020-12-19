package com.codingChallenge.CellsWithOddValuesInAMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellsWithOddValuesInAMatrixTest {

    @Test
    void positiveTest() {
        int n = 2;
        int m = 2;
        int[][] test = {{1, 1}, {0, 0}};
        assertEquals(0, CellsWithOddValuesInAMatrix.oddCells(n,m,test));
    }

    @Test
    void negativeTest() {
        int n = 4;
        int m = 5;
        int[][] test = {{1, 1}, {1, 1}};
        assertNotEquals(5, CellsWithOddValuesInAMatrix.oddCells(n,m,test));
    }

}