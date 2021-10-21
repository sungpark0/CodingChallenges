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

    @Test
    void positiveTestII() {
        assertEquals(5, BestTimeToBuyAndSellStock.maxProfitII(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(1, BestTimeToBuyAndSellStock.maxProfitII(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void positiveTestBottomTop() {
        assertEquals(5, BestTimeToBuyAndSellStock.bottomTop(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void negativeTestBottomTop() {
        assertNotEquals(0, BestTimeToBuyAndSellStock.bottomTop(new int[]{7, 6, 4, 3, 4}));
    }

    @Test
    void positiveTestRecursion() {
        assertEquals(5, BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void negativeTestRecursion() {
        assertNotEquals(0, BestTimeToBuyAndSellStock.maxProfit(new int[]{7, 6, 4, 3, 4}));
    }

    @Test
    void positiveTestTopBottom() {
        assertEquals(5, BestTimeToBuyAndSellStock.maxProfitII(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void negativeTestTopBottom() {
        assertNotEquals(0, BestTimeToBuyAndSellStock.maxProfitII(new int[]{7, 6, 4, 3, 4}));
    }
}