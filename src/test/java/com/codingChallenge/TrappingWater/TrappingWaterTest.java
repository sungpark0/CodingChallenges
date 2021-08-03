package com.codingChallenge.TrappingWater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingWaterTest {

    @Test
    void positiveTest() {
        assertEquals(9, TrappingWater.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(4, TrappingWater.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    void positiveTestII() {
        assertEquals(17, TrappingWater.trapII(new int[]{9, 1, 2, 3, 5, 7}));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(6, TrappingWater.trapII(new int[]{4, 2, 0, 3, 2, 5}));
    }

    @Test
    void positiveTestIII() {
        assertEquals(6, TrappingWater.trapII(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    void negativeTestIII() {
        assertNotEquals(3, TrappingWater.trapII(new int[]{4, 1, 3, 4, 5}));
    }


}