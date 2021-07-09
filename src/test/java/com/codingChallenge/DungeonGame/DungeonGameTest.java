package com.codingChallenge.DungeonGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DungeonGameTest {

    @Test
    void positiveTest() {
        assertEquals(8, DungeonGame.calculateMinimumHP(new int[][]{{-2, -3, 3}, {-5, -10, -6}, {10, 30, -5}}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(41, DungeonGame.calculateMinimumHP(new int[][]{{-10, 20, 30}, {-11, -17, -16}, {5, 1, -4}}));
    }
}