package com.codingChallenge.MinimumCostForTickets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCostForTicketsTest {

    @Test
    void positiveTest() {
        int[] days = new int[]{1, 4, 6, 7, 8, 20};
        int[] costs = new int[]{2, 7, 15};
        assertEquals(11, MinimumCostForTickets.minCostTickets(days, costs));
    }

    @Test
    void negativeTest() {
        int[] days = new int[]{1, 4, 6, 10};
        int[] costs = new int[]{7, 2, 15};
        assertNotEquals(15, MinimumCostForTickets.minCostTickets(days, costs));
    }
}