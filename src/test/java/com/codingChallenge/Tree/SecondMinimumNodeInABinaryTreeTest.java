package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondMinimumNodeInABinaryTreeTest {

    SecondMinimumNodeInABinaryTree test = new SecondMinimumNodeInABinaryTree();

    @Test
    void positiveTest() {
        test.insertIteration(2);
        test.insertIteration(5);
        test.insertIteration(7);

        assertEquals(5, SecondMinimumNodeInABinaryTree.findSecondMinimumValue(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(10);

        assertNotEquals(10, SecondMinimumNodeInABinaryTree.findSecondMinimumValue(test.root));
    }

}