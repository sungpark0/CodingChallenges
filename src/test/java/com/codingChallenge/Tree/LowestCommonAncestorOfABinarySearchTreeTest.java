package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorOfABinarySearchTreeTest {

    LowestCommonAncestorOfABinarySearchTree test = new LowestCommonAncestorOfABinarySearchTree();

    @Test
    void positiveTest() {
        test.insertIteration(6);
        test.insertIteration(2);
        test.insertIteration(8);
        test.insertIteration(0);
        test.insertIteration(4);
        test.insertIteration(7);
        test.insertIteration(9);
        test.insertIteration(3);
        test.insertIteration(5);

        assertEquals(6, LowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(test.root, test.root.left, test.root.right).val);
    }

    @Test
    void negativeTest() {
        test.insertIteration(2);
        test.insertIteration(1);

        assertNotEquals(1, LowestCommonAncestorOfABinarySearchTree.lowestCommonAncestor(test.root, test.root.left, test.root).val);
    }
}