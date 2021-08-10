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

    @Test
    void positiveTestII() {
        assertTrue(DetermineColorOfAChessboardSquare.squareIsWhite("f1"));
    }

    @Test
    void negativeTestII() {
        assertFalse(DetermineColorOfAChessboardSquare.squareIsWhite("a5"));
    }
}