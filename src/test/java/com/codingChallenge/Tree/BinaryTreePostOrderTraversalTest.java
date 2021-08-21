package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePostOrderTraversalTest {

    BinaryTreePostOrderTraversal test = new BinaryTreePostOrderTraversal();

    @Test
    void positiveTest() {
        test.insertIteration(10);
        test.insertIteration(5);
        test.insertIteration(20);
        test.insertIteration(30);

        assertEquals(List.of(5, 30, 20, 10), BinaryTreePostOrderTraversal.postorderTraversal(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(1);
        test.insertIteration(4);
        test.insertIteration(7);
        test.insertIteration(10);

        assertNotEquals(List.of(1, 4, 7, 10), BinaryTreePostOrderTraversal.postorderTraversal(test.root));
    }

}