package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumAbsoluteDifferenceInBSTTest {

    MinimumAbsoluteDifferenceInBST test = new MinimumAbsoluteDifferenceInBST();

    @Test
    void positiveTest() {
        test.insertIteration(4);
        test.insertIteration(2);
        test.insertIteration(3);

        assertEquals(1, MinimumAbsoluteDifferenceInBST.getMinimumDifference(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(1);
        test.insertIteration(4);
        test.insertIteration(0);

        assertNotEquals(3, MinimumAbsoluteDifferenceInBST.getMinimumDifference(test.root));
    }

}