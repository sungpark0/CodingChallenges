package com.codingChallenge.BestTimeToBuyAndSellStockWithCooldown;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockWithCooldownTest {

    @Test
    void positiveTest() {
        assertEquals(3, BestTimeToBuyAndSellStockWithCooldown.maxProfit(new int[]{1, 2, 3, 0, 2}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, BestTimeToBuyAndSellStockWithCooldown.maxProfit(new int[]{1}));
    }

}