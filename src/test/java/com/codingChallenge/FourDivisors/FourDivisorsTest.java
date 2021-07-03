package com.codingChallenge.FourDivisors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourDivisorsTest {

    @Test
    void positiveTest() {
        assertEquals(56, FourDivisors.sumFourDivisors(new int[]{21, 15, 7}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(21, FourDivisors.sumFourDivisors(new int[]{21, 4, 7}));
    }

}