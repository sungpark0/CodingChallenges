package com.codingChallenge.SearchA2DMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchA2DMatrixTest {

    @Test
    void positiveTest() {
        assertTrue(SearchA2DMatrix.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
    }

    @Test
    void negativeTest() {
        assertFalse(SearchA2DMatrix.searchMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 0));
    }
}