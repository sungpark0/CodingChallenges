package com.codingChallenge.KDiffPairsInAnArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KDiffPairsInAnArrayTest {

    @Test
    void positiveTest() {
        assertEquals(2, KDiffPairsInAnArray.findPairs(new int[]{3, 1, 4, 1, 5}, 2));
    }

    @Test
    void negativeTest() {
        assertNotEquals(3, KDiffPairsInAnArray.findPairs(new int[]{1, 2, 3, 4, 5}, 1));
    }

}