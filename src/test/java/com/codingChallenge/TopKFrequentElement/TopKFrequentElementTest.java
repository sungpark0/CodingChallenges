package com.codingChallenge.TopKFrequentElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementTest {

    @Test
    void positiveTest() {
        assertArrayEquals(new int[]{1, 2}, TopKFrequentElement.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
    }

    @Test
    void negativeTest() {
        assertNotEquals(new int[]{1}, TopKFrequentElement.topKFrequent(new int[]{1, 2, 2}, 1));
    }

    @Test
    void positiveTestII() {
        assertArrayEquals(new int[]{1}, TopKFrequentElement.topKFrequent(new int[]{1, 1, 2}, 1));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(new int[]{1, 2}, TopKFrequentElement.topKFrequent(new int[]{1, 1, 2, 3, 3}, 2));
    }

}