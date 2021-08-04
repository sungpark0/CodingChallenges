package com.codingChallenge.FindMinimumInRotatedSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayTest {

    @Test
    void positiveTest() {
        assertEquals(1, FindMinimumInRotatedSortedArray.findMin(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, FindMinimumInRotatedSortedArray.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }

    @Test
    void positiveTestII() {
        assertEquals(1, FindMinimumInRotatedSortedArray.findMinII(new int[]{2, 4, 5, 6, 1}));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(-1, FindMinimumInRotatedSortedArray.findMinII(new int[]{1, 7, 2, 4, 42}));
    }

}