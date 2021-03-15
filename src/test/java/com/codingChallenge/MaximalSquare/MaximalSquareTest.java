package com.codingChallenge.MaximalSquare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximalSquareTest {

    @Test
    void positiveTest() {
        char[][] test = new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        assertEquals(4, MaximalSquare.maximalSquare(test));
    }

    @Test
    void negativeTest() {
        char[][] test = new char[][]{
                {'1', '0', '1'},
                {'1', '0', '1'},
                {'1', '1', '1'},
                {'1', '0', '0'}
        };
        assertNotEquals(3, MaximalSquare.maximalSquare(test));
    }

}