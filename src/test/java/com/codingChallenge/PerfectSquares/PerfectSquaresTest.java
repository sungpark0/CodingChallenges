package com.codingChallenge.PerfectSquares;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PerfectSquaresTest {

    @ParameterizedTest
    @ValueSource(ints = 13)
    void positiveTest(int num) {
        assertEquals(2, PerfectSquares.numSquares(num));
    }

    @ParameterizedTest
    @ValueSource(ints = 20)
    void negativeTest(int num) {
        assertNotEquals(3, PerfectSquares.numSquares(num));
    }

}