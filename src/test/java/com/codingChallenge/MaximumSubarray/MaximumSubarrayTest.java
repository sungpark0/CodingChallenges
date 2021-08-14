package com.codingChallenge.MaximumSubarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarrayTest {

    @Test
    void positiveTest() {
        int[] test = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, MaximumSubarray.maximumSubarray(test));
    }

    @Test
    void negative() {
        int[] test = {-4, 20, 5, 3};
        assertNotEquals(1, MaximumSubarray.maximumSubarray(test));
    }

    @Test
    void positiveTestII() {
        int[] test = {5, 4, -1, 7, 8};
        assertEquals(23, MaximumSubarray.maximumSubarray(test));
    }

    @Test
    void negativeII() {
        int[] test = {1, 2, 5};
        assertNotEquals(5, MaximumSubarray.maximumSubarray(test));
    }

}