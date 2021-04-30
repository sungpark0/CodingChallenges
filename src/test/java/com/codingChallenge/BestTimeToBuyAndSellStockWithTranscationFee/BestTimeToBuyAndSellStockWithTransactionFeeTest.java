package com.codingChallenge.BestTimeToBuyAndSellStockWithTranscationFee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockWithTransactionFeeTest {

    @Test
    void positiveTest() {
        assertEquals(6, BestTimeToBuyAndSellStockWithTransactionFee.maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3));
    }

    @Test
    void negativeTest() {
        assertNotEquals(4, BestTimeToBuyAndSellStockWithTransactionFee.maxProfit(new int[]{4, 1}, 3));
    }
}