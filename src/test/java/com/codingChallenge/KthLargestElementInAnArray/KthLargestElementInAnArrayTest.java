package com.codingChallenge.KthLargestElementInAnArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInAnArrayTest {

    @Test
    void positiveTest() {
        assertEquals(5, KthLargestElementInAnArray.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    void negativeTest() {
        assertNotEquals(10, KthLargestElementInAnArray.findKthLargest(new int[]{1, 5, 10, 20}, 3));
    }

    @Test
    void positiveTestII() {
        assertEquals(10, KthLargestElementInAnArray.findKthLargest(new int[]{1, 5, 10, 15, 20}, 3));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(1, KthLargestElementInAnArray.findKthLargest(new int[]{1, 54, 4, 7}, 2));
    }

}