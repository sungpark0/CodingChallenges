package com.codingChallenge.MinimumMovesToEqualArrayElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumMovesToEqualArrayElementsTest {

    @Test
    void positiveTest() {
        assertEquals(3, MinimumMovesToEqualArrayElements.minMoves(new int[]{1, 2, 3}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, MinimumMovesToEqualArrayElements.minMoves(new int[]{1, 2, 2, 1}));
    }

    @Test
    void positiveTestII() {
        assertEquals(10, MinimumMovesToEqualArrayElements.minMoves(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(10, MinimumMovesToEqualArrayElements.minMoves(new int[]{1, 2, 7}));
    }

}