package com.codingChallenge.SqrtX;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtXTest {

    @Test
    void positiveTest() {
        assertEquals(2, SqrtX.mySqrt(8));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1.2, SqrtX.mySqrt(3));
    }
}