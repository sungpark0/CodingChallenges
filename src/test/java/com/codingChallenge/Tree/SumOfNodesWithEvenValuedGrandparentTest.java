package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNodesWithEvenValuedGrandparentTest {

    SumOfNodesWithEvenValuedGrandparent test = new SumOfNodesWithEvenValuedGrandparent();

    @Test
    void positiveTest() {
        test.insertIteration(10);
        test.insertIteration(6);
        test.insertIteration(2);
        test.insertIteration(5);
        test.insertIteration(15);
        test.insertIteration(20);
        test.insertIteration(16);
        test.insertIteration(19);

        assertEquals(46, SumOfNodesWithEvenValuedGrandparent.sumEvenGrandparent(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(10);
        test.insertIteration(5);
        test.insertIteration(2);
        test.insertIteration(15);

        assertNotEquals(17, SumOfNodesWithEvenValuedGrandparent.sumEvenGrandparent(test.root));
    }
}