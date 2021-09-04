package com.codingChallenge.FindFirstandLastPositionOfElementInSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    void positiveTest() {
        assertArrayEquals(new int[]{3, 4}, FindFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }

    @Test
    void negativeTest() {
        assertNotEquals(new int[]{0,0}, FindFirstAndLastPositionOfElementInSortedArray.searchRange(new int[] {}, 0));
    }
}