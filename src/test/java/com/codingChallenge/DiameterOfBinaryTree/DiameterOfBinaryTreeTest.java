package com.codingChallenge.DiameterOfBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiameterOfBinaryTreeTest {

    DiameterOfBinaryTree test = new DiameterOfBinaryTree();

    @Test
    void positiveTest() {
        test.insertRecursion(3);
        test.insertRecursion(2);
        test.insertRecursion(1);
        test.insertRecursion(4);

        assertEquals(3, DiameterOfBinaryTree.diameterOfBinaryTree(test.root));
    }

    @Test
    void negativeTest() {
        test.insertRecursion(1);
        test.insertRecursion(3);
        test.insertRecursion(4);
        test.insertRecursion(7);
        test.insertRecursion(10);

        assertNotEquals(5, DiameterOfBinaryTree.diameterOfBinaryTree(test.root));
    }

}