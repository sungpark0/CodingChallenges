package com.codingChallenge.SearchInRotatedSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class
SearchInRotatedSortedArrayTest {

    @Test
    void positiveTest() {
        int[] test = {4, 5, 1, 2, 3};
        assertEquals(2, SearchInRotatedSortedArray.search(test, 1));
    }

    @Test
    void negativeTest() {
        int[] test = {5, 6, 7, 8, 1, 2, 3};
        assertNotEquals(1, SearchInRotatedSortedArray.search(test, 7));
    }

}