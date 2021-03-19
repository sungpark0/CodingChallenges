package com.codingChallenge.CoinChange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    @Test
    void positiveTest() {
        assertEquals(3, CoinChange.coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, CoinChange.coinChange(new int[]{2}, 3));
    }

}