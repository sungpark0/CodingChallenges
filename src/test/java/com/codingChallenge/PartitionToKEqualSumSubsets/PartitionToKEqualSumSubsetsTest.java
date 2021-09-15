package com.codingChallenge.PartitionToKEqualSumSubsets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionToKEqualSumSubsetsTest {

    @Test
    void positiveTest() {
        assertTrue(PartitionToKEqualSumSubsets.canPartitionKSubsets(new int[]{4, 3, 2, 3, 5, 2, 1}, 4));
    }

    @Test
    void negativeTest() {
        assertFalse(PartitionToKEqualSumSubsets.canPartitionKSubsets(new int[]{7, 7, 2, 2, 2, 2, 9, 4, 7}, 4));
    }

}