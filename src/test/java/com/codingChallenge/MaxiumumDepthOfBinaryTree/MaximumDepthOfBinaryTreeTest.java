package com.codingChallenge.MaxiumumDepthOfBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {

    MaximumDepthOfBinaryTree test = new MaximumDepthOfBinaryTree();

    @Test
    void positiveTest() {
        test.insertIteration(10);
        test.insertIteration(5);
        test.insertIteration(15);
        test.insertIteration(20);
        assertEquals(3, MaximumDepthOfBinaryTree.maxDepth(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(2);
        assertNotEquals(0, MaximumDepthOfBinaryTree.maxDepth(test.root));
    }

}