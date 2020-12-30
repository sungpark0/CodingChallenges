package com.codingChallenge.BestTimeToBuyAndSellStockII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockIITest {

    @Test
    void positiveTest() {
        int[] test = {7, 1, 8, 3, 1, 6, 2};
        assertEquals(12, BestTimeToBuyAndSellStockII.maxProfit(test));
    }

    @Test
    void negativeTest() {
        int[] test = {1, 2, 3, 4, 5, 6};
        assertNotEquals(3, BestTimeToBuyAndSellStockII.maxProfit(test));
    }
}