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

}