package com.codingChallenge.MergeIntervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    @Test
    void positiveTest() {
        assertArrayEquals(new int[][]{{1, 5}}, MergeIntervals.merge(new int[][]{{1, 4}, {4, 5}}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(new int[][]{{1, 10}, {10, 18}}, MergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }

}