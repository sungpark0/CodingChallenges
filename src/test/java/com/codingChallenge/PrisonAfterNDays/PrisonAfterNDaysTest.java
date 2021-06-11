package com.codingChallenge.PrisonAfterNDays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrisonAfterNDaysTest {

    @Test
    void positiveTest() {
        assertArrayEquals(new int[]{0, 0, 1, 1, 0, 0, 0, 0}, PrisonAfterNDays.prisonAfterNDays(new int[]{0, 1, 0, 1, 1, 0, 0, 1}, 7));
    }

    @Test
    void negativeTest() {
        assertNotEquals(new int[]{1, 0, 0, 1, 0, 0, 1, 0}, PrisonAfterNDays.prisonAfterNDays(new int[]{0, 0, 1, 1, 1, 1, 1, 0}, 4));
    }

}