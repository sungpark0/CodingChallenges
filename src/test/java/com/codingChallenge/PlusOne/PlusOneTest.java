package com.codingChallenge.PlusOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    void positiveTest() {
        assertArrayEquals(new int[]{1, 2, 4}, PlusOne.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(new int[]{9, 9}, PlusOne.plusOne(new int[]{0, 0}));
    }
}