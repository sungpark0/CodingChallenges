package com.codingChallenge.HouseRobber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    @Test
    void positiveTest() {
        assertEquals(4, HouseRobber.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(22, HouseRobber.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    void positiveTestII() {
        assertEquals(12, HouseRobber.rob(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    void negativeTestII() {
        assertNotEquals(5, HouseRobber.rob(new int[]{5, 10, 15}));
    }

}