package com.codingChallenge.MaximumUnitsOnATruck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumUnitsOnATruckTest {

    @Test
    void positiveTest() {
        assertEquals(91, MaximumUnitsOnATruck.maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10));
    }

    @Test
    void negativeTest() {
        assertNotEquals(5, MaximumUnitsOnATruck.maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4));
    }

}