package com.codingChallenge.DungeonGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DungeonGameTest {

    @Test
    void positiveTest() {
        int[][] test = new int[][]{{-2, -3, 3}, {-5, -10, -6}, {10, 30, -5}};
        assertEquals(8, DungeonGame.calculateMinimumHP(test));
    }

    @Test
    void negativeTest() {
        int[][] test = new int[][]{{-10, 20, 30}, {-11, -17, -16}, {5, 1, -4}};
        assertNotEquals(41, DungeonGame.calculateMinimumHP(test));
    }
}