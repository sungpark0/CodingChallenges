package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSmallestElementInABSTTest {

    KthSmallestElementInABST test = new KthSmallestElementInABST();

    @Test
    void positiveTest() {
        test.insertIteration(3);
        test.insertIteration(1);
        test.insertIteration(4);
        test.insertIteration(2);

        assertEquals(1, KthSmallestElementInABST.kthSmallest(test.root, 1));
    }

    @Test
    void negativeTest() {
        test.insertIteration(5);
        test.insertIteration(3);
        test.insertIteration(4);
        test.insertIteration(6);

        assertNotEquals(4, KthSmallestElementInABST.kthSmallest(test.root, 3));
    }

}