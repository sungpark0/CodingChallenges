package com.codingChallenge.UniquePathsII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsIITest {

    @Test
    void positiveTest() {
        assertEquals(2, UniquePathsII.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(0, UniquePathsII.uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}}));
    }

}