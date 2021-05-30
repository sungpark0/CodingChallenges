package com.codingChallenge.AllNodesDistanceKInBinaryTree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AllNodesDistanceKInBinaryTreeTest {

    AllNodesDistanceKInBinaryTree tree = new AllNodesDistanceKInBinaryTree();

    @Test
    void positiveTest() {
        tree.insertRecursion(5);
        tree.insertRecursion(3);
        tree.insertRecursion(1);
        tree.insertRecursion(7);
        tree.insertRecursion(9);
        assertEquals(List.of(1, 5), AllNodesDistanceKInBinaryTree.distanceK(tree.root, tree.root.left, 1));
    }

    @Test
    void negativeTest() {
        tree.insertRecursion(10);
        tree.insertRecursion(5);
        tree.insertRecursion(1);
        tree.insertRecursion(15);
        tree.insertRecursion(20);
        assertNotEquals(List.of(5, 15), AllNodesDistanceKInBinaryTree.distanceK(tree.root, tree.root, 2));
    }

}