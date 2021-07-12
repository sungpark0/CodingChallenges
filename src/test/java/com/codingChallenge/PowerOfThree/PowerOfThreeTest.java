package com.codingChallenge.PowerOfThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfThreeTest {

    @Test
    void positiveTest() {
        assertTrue(PowerOfThree.isPowerOfThree(27));
    }

    @Test
    void negativeTest() {
        assertFalse(PowerOfThree.isPowerOfThree(0));
    }

}