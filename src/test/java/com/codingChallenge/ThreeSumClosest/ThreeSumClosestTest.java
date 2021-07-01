package com.codingChallenge.ThreeSumClosest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosestTest {

    @Test
    void positiveTest() {
        assertEquals(2, ThreeSumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }

    @Test
    void negativeTest() {
        assertNotEquals(0, ThreeSumClosest.threeSumClosest(new int[]{-3, -3, -4}, 5));
    }
}