package com.codingChallenge.LastStoneWeightII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightIITest {

    @Test
    void positiveTest() {
        assertEquals(1, LastStoneWeightII.lastStoneWeightII(new int[]{2, 7, 4, 1, 8, 1}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(3, LastStoneWeightII.lastStoneWeightII(new int[]{31, 26, 33, 21, 40}));
    }

}