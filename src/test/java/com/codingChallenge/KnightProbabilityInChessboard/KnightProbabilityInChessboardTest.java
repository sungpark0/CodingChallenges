package com.codingChallenge.KnightProbabilityInChessboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightProbabilityInChessboardTest {

    @Test
    void positiveTest() {
        assertEquals(0.0625, KnightProbabilityInChessboard.knightProbability(3, 2, 0, 0));
    }

    @Test
    void negativeTest() {
        assertNotEquals(0, KnightProbabilityInChessboard.knightProbability(1, 0, 0, 0));
    }
}