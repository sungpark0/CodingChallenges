package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIVInputIsABSTTest {

    TwoSumIVInputIsABST test = new TwoSumIVInputIsABST();

    @Test
    void positiveTest() {
        test.insertIteration(5);
        test.insertIteration(3);
        test.insertIteration(6);
        test.insertIteration(2);
        test.insertIteration(4);
        test.insertIteration(7);

        assertTrue(TwoSumIVInputIsABST.findTarget(test.root, 9));
    }

    @Test
    void negativeTest() {
        test.insertIteration(2);
        test.insertIteration(1);
        test.insertIteration(3);

        assertFalse(TwoSumIVInputIsABST.findTarget(test.root, 2));
    }

}