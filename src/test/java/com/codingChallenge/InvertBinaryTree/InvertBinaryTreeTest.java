package com.codingChallenge.InvertBinaryTree;

import com.codingChallenge.Tree.BinaryTreeInOrderTraversal;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {

    InvertBinaryTree test = new InvertBinaryTree();

    @Test
    void positiveTest() {
        test.insertIteration(10);
        test.insertIteration(5);
        test.insertIteration(15);
        InvertBinaryTree.invertTree(test.root);

        assertEquals(List.of(15, 10, 5), BinaryTreeInOrderTraversal.inorderTraversal(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(2);
        test.insertIteration(1);
        test.insertIteration(3);
        test.insertIteration(5);
        InvertBinaryTree.invertTree(test.root);

        assertNotEquals(List.of(5, 3, 1, 2), BinaryTreeInOrderTraversal.inorderTraversal(test.root));

    }

}