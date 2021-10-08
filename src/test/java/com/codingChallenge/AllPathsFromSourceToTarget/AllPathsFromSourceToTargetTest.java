package com.codingChallenge.AllPathsFromSourceToTarget;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllPathsFromSourceToTargetTest {

    @Test
    void positiveTest() {
        assertEquals(List.of(List.of(0, 1, 3), List.of(0, 2, 3)), AllPathsFromSourceToTarget.allPathsSourceTarget(new int[][]{{1, 2}, {3}, {3}, {}}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(List.of(List.of(1)), AllPathsFromSourceToTarget.allPathsSourceTarget(new int[][]{{1}, {}}));
    }
}