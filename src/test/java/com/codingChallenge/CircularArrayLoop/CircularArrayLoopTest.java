package com.codingChallenge.CircularArrayLoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularArrayLoopTest {

    @Test
    void positiveTest() {
        assertTrue(CircularArrayLoop.circularArrayLoop(new int[]{2, -1, 1, 2, 2}));
    }

    @Test
    void negativeTest() {
        assertFalse(CircularArrayLoop.circularArrayLoop(new int[]{-1, 2}));
    }

}