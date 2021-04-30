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

}