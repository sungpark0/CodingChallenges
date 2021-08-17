package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInOrderTraversalTest {

    BinaryTreeInOrderTraversal test = new BinaryTreeInOrderTraversal();

    @Test
    void positiveTest() {
        test.insertIteration(2);
        test.insertIteration(1);
        test.insertIteration(3);

        assertEquals(List.of(1, 2, 3), BinaryTreeInOrderTraversal.inorderTraversal(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(10);
        test.insertIteration(15);
        test.insertIteration(5);
        test.insertIteration(7);

        assertNotEquals(List.of(5, 10, 7, 15), BinaryTreeInOrderTraversal.inorderTraversal(test.root));
    }

}