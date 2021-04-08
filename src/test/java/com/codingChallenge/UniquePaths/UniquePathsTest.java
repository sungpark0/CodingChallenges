package com.codingChallenge.UniquePaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {

    @Test
    void positiveTest() {
        assertEquals(28, UniquePaths.uniquePaths(3, 7));
    }

    @Test
    void negativeTest() {
        assertNotEquals(2, UniquePaths.uniquePaths(2, 1));
    }

}