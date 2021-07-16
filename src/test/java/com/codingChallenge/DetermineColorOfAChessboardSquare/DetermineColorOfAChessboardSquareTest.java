package com.codingChallenge.DetermineColorOfAChessboardSquare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetermineColorOfAChessboardSquareTest {

    @Test
    void positiveTest() {
        assertTrue(DetermineColorOfAChessboardSquare.squareIsWhite("h3"));
    }

    @Test
    void negativeTest() {
        assertFalse(DetermineColorOfAChessboardSquare.squareIsWhite("a1"));
    }
}