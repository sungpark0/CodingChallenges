package com.codingChallenge.SearchInRotatedSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class
SearchInRotatedSortedArrayTest {

    @Test
    void positiveTest() {
        assertEquals(2, SearchInRotatedSortedArray.searchII(new int[]{4, 5, 1, 2, 3}, 1));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, SearchInRotatedSortedArray.searchII(new int[]{5, 6, 7, 8, 1, 2, 3}, 7));
    }

}