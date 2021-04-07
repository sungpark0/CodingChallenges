package com.codingChallenge.TilingARectangleWithTheFewestSquares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TilingARectangleWithTheFewestSquaresTest {

    @Test
    void positiveTest(){
        assertEquals(3, TilingARectangleWithTheFewestSquares.tilingRectangle(2, 3));
    }

    @Test
    void negativeTest(){
        assertNotEquals(4, TilingARectangleWithTheFewestSquares.tilingRectangle(5,8));
    }
}