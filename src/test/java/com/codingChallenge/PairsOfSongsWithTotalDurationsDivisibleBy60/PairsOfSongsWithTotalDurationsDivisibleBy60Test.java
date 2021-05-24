package com.codingChallenge.PairsOfSongsWithTotalDurationsDivisibleBy60;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairsOfSongsWithTotalDurationsDivisibleBy60Test {

    @Test
    void positiveTest() {
        assertEquals(3, PairsOfSongsWithTotalDurationsDivisibleBy60.numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(1, PairsOfSongsWithTotalDurationsDivisibleBy60.numPairsDivisibleBy60(new int[]{60, 60, 60}));
    }
}