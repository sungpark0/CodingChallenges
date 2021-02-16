package com.codingChallenge.SearchA2DMatrixII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchA2DMatrixIITest {

    @Test
    void positiveTest() {
        int[][] test = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30},};
        assertTrue(SearchA2DMatrixII.searchMatrix(test, 5));
    }

    @Test
    void negativeTest() {
        int[][] test = new int[][]{
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}};
        assertFalse(SearchA2DMatrixII.searchMatrix(test, 20));
    }

}