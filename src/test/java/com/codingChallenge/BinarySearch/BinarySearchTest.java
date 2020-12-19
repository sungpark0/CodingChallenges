package com.codingChallenge.BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void positiveTest() {
        int[] test = {-1, 0, 3, 4, 5, 9, 11, 14};
        assertEquals(7, BinarySearch.search(test, 14));
    }

    @Test
    void negativeTest() {
        int[] test = {-20, -10, 0, 10 , 20, 30};
        assertNotEquals(3, BinarySearch.search(test, 14));
    }
}