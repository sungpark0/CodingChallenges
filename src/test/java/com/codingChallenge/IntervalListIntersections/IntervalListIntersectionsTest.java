package com.codingChallenge.IntervalListIntersections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntervalListIntersectionsTest {

    @Test
    void positiveTest() {
        assertArrayEquals(new int[][]{{3, 7}}, IntervalListIntersections.intervalIntersection(
                new int[][]{{1, 7}}, new int[][]{{3, 10}})
        );
    }

    @Test
    void negativeTest() {
        assertNotEquals(new int[][]{{1, 12}}, IntervalListIntersections.intervalIntersection(
                new int[][]{}, new int[][]{{4, 8}, {10, 12}})
        );
    }

}