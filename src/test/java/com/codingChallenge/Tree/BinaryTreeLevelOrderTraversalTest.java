package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalTest {

    BinaryTreeLevelOrderTraversal tree = new BinaryTreeLevelOrderTraversal();

    @Test
    void positiveTest() {
        tree.insertRecursion(20);
        tree.insertRecursion(15);
        tree.insertRecursion(25);
        tree.insertRecursion(10);
        tree.insertRecursion(30);
        tree.insertRecursion(35);

        assertEquals(List.of(
                List.of(20),
                List.of(15, 25),
                List.of(10, 30),
                List.of(35)), BinaryTreeLevelOrderTraversal.levelOrder(tree.root));
    }

    @Test
    void negativeTest() {
        tree.insertRecursion(10);
        tree.insertRecursion(5);
        tree.insertRecursion(20);

        assertNotEquals(List.of(
                List.of(5),
                List.of(10),
                List.of(20)), BinaryTreeLevelOrderTraversal.levelOrder(tree.root));
    }

    @Test
    void positiveTestII() {
        tree.insertRecursion(3);
        tree.insertRecursion(9);
        tree.insertRecursion(20);
        tree.insertRecursion(15);
        tree.insertRecursion(7);

        assertEquals(List.of(
                List.of(3),
                List.of(9),
                List.of(7, 20),
                List.of(15)), BinaryTreeLevelOrderTraversal.levelOrderII(tree.root));
    }

    @Test
    void negativeTestII() {
        tree.insertRecursion(1);
        tree.insertRecursion(3);

        assertNotEquals(List.of(List.of(1)), BinaryTreeLevelOrderTraversal.levelOrderII(tree.root));
    }
}