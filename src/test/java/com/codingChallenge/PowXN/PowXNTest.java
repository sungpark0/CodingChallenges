package com.codingChallenge.PowXN;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowXNTest {

    @Test
    void positiveTest() {
        assertEquals(1024.0, PowXN.myPow(2.0, 10));
    }

    @Test
    void negativeTest() {
        assertNotEquals(0, PowXN.myPow(2.1, 0));
    }

}