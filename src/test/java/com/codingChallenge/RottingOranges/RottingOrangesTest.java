package com.codingChallenge.RottingOranges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RottingOrangesTest {

    @Test
    void positiveTest() {
        assertEquals(4, RottingOranges.orangesRotting(new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(3, RottingOranges.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}));
    }
}