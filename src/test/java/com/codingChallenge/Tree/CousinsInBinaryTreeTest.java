package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CousinsInBinaryTreeTest {

    CousinsInBinaryTree test = new CousinsInBinaryTree();

    @Test
    void positiveTest() {
        test.insertIteration(5);
        test.insertIteration(4);
        test.insertIteration(6);
        test.insertIteration(3);
        test.insertIteration(7);

        assertTrue(CousinsInBinaryTree.isCousins(test.root, 3, 7));
    }

    @Test
    void negativeTest() {
        test.insertIteration(1);
        test.insertIteration(3);
        test.insertIteration(7);
        test.insertIteration(2);

        assertFalse(CousinsInBinaryTree.isCousins(test.root, 1, 7));
    }

}