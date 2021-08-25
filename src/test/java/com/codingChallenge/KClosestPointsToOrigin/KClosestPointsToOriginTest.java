package com.codingChallenge.KClosestPointsToOrigin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KClosestPointsToOriginTest {


    @Test
    void positiveTest() {
        assertArrayEquals(new int[][]{{-2, 2}}, KClosestPointsToOrigin.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1));
    }

    @Test
    void negativeTest() {
        assertNotEquals(new int[][]{{5, -1}, {3, 3}, {-2, 4}}, KClosestPointsToOrigin.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2));
    }

    @Test
    void positiveTestII() {
        assertArrayEquals(new int[][]{{2, 3}, {0, 5}}, KClosestPointsToOrigin.kClosestII(new int[][]{{0, 5}, {2, 3}, {5, 1}}, 2));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(new int[][]{{5, 5}}, KClosestPointsToOrigin.kClosestII(new int[][]{{2, 2}, {5, 5}}, 1));
    }
}