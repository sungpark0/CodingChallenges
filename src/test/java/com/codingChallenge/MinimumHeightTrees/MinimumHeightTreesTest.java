package com.codingChallenge.MinimumHeightTrees;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumHeightTreesTest {

    @Test
    void positiveTest() {
        assertEquals(List.of(3, 4), MinimumHeightTrees.findMinHeightTrees(6, new int[][]{{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(List.of(), MinimumHeightTrees.findMinHeightTrees(1, new int[][]{{}}));
    }

}