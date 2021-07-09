package com.codingChallenge.BoatsToSavePeople;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoatsToSavePeopleTest {

    @Test
    void positiveTest() {
        assertEquals(1, BoatsToSavePeople.numRescueBoats(new int[]{1, 2}, 3));
    }

    @Test
    void negativeTest() {
        assertNotEquals(5, BoatsToSavePeople.numRescueBoats(new int[]{3, 5, 2, 4, 3}, 5));
    }
}