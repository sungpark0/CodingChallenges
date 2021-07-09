package com.codingChallenge.ContainerWithMostWater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    void positiveTest() {
        assertEquals(49, ContainerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(4, ContainerWithMostWater.maxArea(new int[]{1, 2, 1}));
    }

}