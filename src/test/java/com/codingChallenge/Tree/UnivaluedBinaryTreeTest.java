package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnivaluedBinaryTreeTest {

    UnivaluedBinaryTree test = new UnivaluedBinaryTree();

    @Test
    void positiveTest() {
        test.insertIteration(3);

        assertTrue(UnivaluedBinaryTree.isUnivalTree(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(5);
        test.insertIteration(3);

        assertFalse(UnivaluedBinaryTree.isUnivalTree(test.root));
    }

}