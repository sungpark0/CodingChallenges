package com.codingChallenge.FloodFill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloodFillTest {

    @Test
    void positiveTest() {
        assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}}, FloodFill.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2));
    }

    @Test
    void negativeTest() {
        assertNotEquals(new int[][]{{1, 1}, {1, 0}}, FloodFill.floodFill(new int[][]{{2, 2}, {2, 0}}, 1, 1, 2));
    }

}