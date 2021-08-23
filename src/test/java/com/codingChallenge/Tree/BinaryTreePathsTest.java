package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePathsTest {

    BinarySearchTree test = new BinaryTreePaths();

    @Test
    void positiveTest() {
        test.insertIteration(5);
        test.insertIteration(10);
        test.insertIteration(15);
        test.insertIteration(2);

        assertEquals(List.of("5->2", "5->10->15"), BinaryTreePaths.binaryTreePaths(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(1);
        test.insertIteration(4);
        test.insertIteration(7);
        test.insertIteration(10);

        assertNotEquals(List.of("1->4", "1->4->7->10"), BinaryTreePaths.binaryTreePaths(test.root));
    }
}