package com.codingChallenge.GameOfLife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeTest {

    @Test
    void positiveTest() {
        int[][] test = new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        GameOfLife.gameOfLife(test);
        assertArrayEquals(new int[][]{{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}}, test);
    }

    @Test
    void negativeTest() {
        int[][] test = new int[][]{{1, 1}, {1, 0}};
        GameOfLife.gameOfLife(test);
        assertNotEquals(new int[][]{{0, 0}, {1, 0}}, test);
    }
}