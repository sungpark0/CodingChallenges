package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalIITest {

    BinaryTreeLevelOrderTraversalII test = new BinaryTreeLevelOrderTraversalII();

    @Test
    void positiveTest() {
        test.insertRecursion(3);
        test.insertRecursion(9);
        test.insertRecursion(20);
        test.insertRecursion(15);
        test.insertRecursion(7);
        assertEquals(List.of(List.of(15), List.of(7, 20), List.of(9), List.of(3)), BinaryTreeLevelOrderTraversalII.levelOrderBottom(test.root));
    }

    @Test
    void negativeTest() {
        test.insertRecursion(5);
        test.insertRecursion(10);
        test.insertRecursion(15);
        test.insertRecursion(20);

        assertNotEquals(List.of(List.of(5), List.of(10,15), List.of(20)), BinaryTreeLevelOrderTraversalII.levelOrderBottom(test.root));
    }
}