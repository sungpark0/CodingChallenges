package com.codingChallenge.FindIfPathExistsInGraph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIfPathExistsInGraphTest {

    @Test
    void positiveTest() {
        assertTrue(FindIfPathExistsInGraph.validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2));
    }

    @Test
    void negativeTest() {
        assertFalse(FindIfPathExistsInGraph.validPath(6, new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}}, 0, 5));
    }

}