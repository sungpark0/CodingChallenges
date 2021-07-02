package com.codingChallenge.CoinChange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    @Test
    void positiveTest() {
        assertEquals(4, CoinChange.coinChange(new int[]{1, 2, 3, 5}, 14));
    }

    @Test
    void negativeTest() {
        assertNotEquals(-1, CoinChange.coinChange(new int[]{1}, 3));
    }

}