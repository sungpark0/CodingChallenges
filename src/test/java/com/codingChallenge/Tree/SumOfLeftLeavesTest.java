package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfLeftLeavesTest {

    SumOfLeftLeaves test = new SumOfLeftLeaves();

    @Test
    void positiveTest() {
        test.insertIteration(15);
        test.insertIteration(3);
        test.insertIteration(20);

        assertEquals(3, SumOfLeftLeaves.sumOfLeftLeaves(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(10);

        assertNotEquals(0, SumOfLeftLeaves.sumOfLeftLeaves(test.root));
    }

}