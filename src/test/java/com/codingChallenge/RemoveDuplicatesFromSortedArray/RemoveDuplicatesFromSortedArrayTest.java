package com.codingChallenge.RemoveDuplicatesFromSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void positiveTest() {
        assertEquals(2, RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, RemoveDuplicatesFromSortedArray.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3}));
    }
}