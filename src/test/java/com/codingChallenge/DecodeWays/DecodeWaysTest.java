package com.codingChallenge.DecodeWays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeWaysTest {

    @Test
    void positiveTest() {
        assertEquals(2, DecodeWays.numDecodings("12"));
    }

    @Test
    void negativeTest() {
        assertNotEquals(3, DecodeWays.numDecodings("11106"));
    }

    @Test
    void positiveTestII() {
        assertEquals(3, DecodeWays.numDecodings("226"));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(5, DecodeWays.numDecodings("12344"));
    }

}