package com.codingChallenge.CountPrimes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPrimesTest {

    @Test
    void positiveTest() {
        assertEquals(4, CountPrimes.countPrimes(10));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, CountPrimes.countPrimes(1));
    }

    @Test
    void positiveTestII() {
        assertEquals(4, CountPrimes.countPrimesII(9));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(1, CountPrimes.countPrimesII(2));
    }

}