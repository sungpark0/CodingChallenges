package com.codingChallenge.SquareOfASortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareOfASortedArrayTest {

    @Test
    void positiveTest() {
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, SquareOfASortedArray.sortedSquares(new int[]{-4, -1, 0, 3, 10}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(new int[]{9, 1, 81}, SquareOfASortedArray.sortedSquares(new int[]{-3, 1, 9}));
    }

    @Test
    void positiveTestII() {
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, SquareOfASortedArray.sortedSquares(new int[]{-7, -3, 2, 3, 11}));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(new int[]{100, 25, 175}, SquareOfASortedArray.sortedSquares(new int[]{10, 5, 15}));
    }
}