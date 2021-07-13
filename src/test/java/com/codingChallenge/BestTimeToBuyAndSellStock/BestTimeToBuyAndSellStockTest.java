package com.codingChallenge.BestTimeToBuyAndSellStock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void positiveTest() {
        int[] test = {3, 2, 6, 5, 0, 3};
        assertEquals(4, BestTimeToBuyAndSellStock.maxProfitMath(test));
    }

    @Test
    void negativeTest() {
        int[] test = {1, 2, 4, 6, 7, 8, 9, 10};
        assertNotEquals(0, BestTimeToBuyAndSellStock.maxProfitMath(test));
    }

}