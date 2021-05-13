package com.codingChallenge.NumberOfProvinces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfProvincesTest {

    @Test
    void positiveTest() {
        assertEquals(2, NumberOfProvinces.findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, NumberOfProvinces.findCircleNum(new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
    }
}