package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindModeInBinarySearchTreeTest {

    FindModeInBinarySearchTree test = new FindModeInBinarySearchTree();

    @Test
    void positiveTest() {
        test.insertIteration(1);
        test.insertIteration(2);

        assertArrayEquals(new int[]{1, 2}, FindModeInBinarySearchTree.findMode(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(1);
        test.insertIteration(5);
        test.insertIteration(3);

        assertNotEquals(new int[]{1, 3}, FindModeInBinarySearchTree.findMode(test.root));
    }


}