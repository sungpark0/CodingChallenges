package com.codingChallenge.OutOfBoundaryPaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutOfBoundaryPathsTest {

    @Test
    void positiveTest() {
        assertEquals(6, OutOfBoundaryPaths.findPaths(2, 2, 2, 0, 0));
    }

    @Test
    void negativeTest() {
        assertNotEquals(6, OutOfBoundaryPaths.findPaths(1, 3, 3, 0, 1));
    }
}