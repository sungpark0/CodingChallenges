package com.codingChallenge.PartitionEqualSubsetSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionEqualSubsetSumTest {

    @Test
    void positiveTest() {
        assertTrue(PartitionEqualSubsetSum.canPartition(new int[]{1, 5, 11, 5}));
    }

    @Test
    void negativeTest() {
        assertFalse(PartitionEqualSubsetSum.canPartition(new int[]{1, 2, 3, 5}));
    }
}