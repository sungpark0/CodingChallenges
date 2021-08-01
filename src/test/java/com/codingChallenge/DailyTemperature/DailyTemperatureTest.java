package com.codingChallenge.DailyTemperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperatureTest {

    @Test
    void positiveTest() {
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0},
                DailyTemperature.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(new int[]{30, 60, 90}, DailyTemperature.dailyTemperatures(new int[]{2, 1, 0}));
    }
}