package com.codingChallenge.MinimumDepthOfBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDepthOfBinaryTreeTest {

    MinimumDepthOfBinaryTree test = new MinimumDepthOfBinaryTree();

    @Test
    void positiveTest() {
        test.insertIteration(9);
        test.insertIteration(3);
        test.insertIteration(12);
        test.insertIteration(11);
        test.insertIteration(17);
        assertEquals(2, MinimumDepthOfBinaryTree.minDepth(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(10);
        test.insertIteration(5);
        test.insertIteration(15);
        assertNotEquals(1, MinimumDepthOfBinaryTree.minDepth(test.root));
    }

    @Test
    void positiveTestII() {
        test.insertIteration(10);
        test.insertIteration(5);
        test.insertIteration(15);
        test.insertIteration(20);

        assertEquals(2, MinimumDepthOfBinaryTree.minDepthII(test.root));
    }

    @Test
    void negativeTestII() {
        test.insertIteration(10);
        test.insertIteration(5);

        assertNotEquals(0, MinimumDepthOfBinaryTree.minDepthII(test.root));
    }

}