package com.codingChallenge.PathSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {

    PathSum test = new PathSum();

    @Test
    void positiveTest() {
        test.insertIteration(10);
        test.insertIteration(5);
        test.insertIteration(15);

        assertTrue(PathSum.hasPathSum(test.root, 15));
    }

    @Test
    void negativeTest() {
        test.insertIteration(7);
        test.insertIteration(5);
        test.insertIteration(3);
        test.insertIteration(10);

        assertFalse(PathSum.hasPathSum(test.root, 10));
    }

}