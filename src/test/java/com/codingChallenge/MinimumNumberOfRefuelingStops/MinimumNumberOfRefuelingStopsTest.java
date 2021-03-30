package com.codingChallenge.MinimumNumberOfRefuelingStops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfRefuelingStopsTest {

    @Test
    void positiveTest() {
        int[][] test = new int[][]{{10, 60}, {20, 30}, {30, 30}, {60, 40}};
        assertEquals(2, MinimumNumberOfRefuelingStops.minRefuelStops(100, 10, test));
    }

    @Test
    void negativeTest() {
        assertNotEquals(0, MinimumNumberOfRefuelingStops.minRefuelStops(100, 1, new int[][]{{10, 100}}));
    }

}