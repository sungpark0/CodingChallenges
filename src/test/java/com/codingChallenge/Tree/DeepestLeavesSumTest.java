package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeepestLeavesSumTest {

    DeepestLeavesSum test = new DeepestLeavesSum();

    @Test
    void positiveTest() {
        test.insertIteration(5);
        test.insertIteration(2);
        test.insertIteration(7);

        assertEquals(9, DeepestLeavesSum.deepestLeavesSum(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(3);
        test.insertIteration(1);
        test.insertIteration(4);

        assertNotEquals(4, DeepestLeavesSum.deepestLeavesSum(test.root));
    }
}