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
}