package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountGoodNodesInBinaryTreeTest {

    CountGoodNodesInBinaryTree test = new CountGoodNodesInBinaryTree();

    @Test
    void positiveTest() {
        test.insertIteration(3);
        test.insertIteration(2);
        test.insertIteration(4);
        test.insertIteration(5);

        assertEquals(3, CountGoodNodesInBinaryTree.goodNodes(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(5);
        test.insertIteration(3);
        test.insertIteration(1);

        assertNotEquals(0, CountGoodNodesInBinaryTree.goodNodes(test.root));
    }

}