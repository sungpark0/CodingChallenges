package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {

    BalancedBinaryTree tree = new BalancedBinaryTree();

    @Test
    void positiveTest() {
        tree.insertIteration(9);
        tree.insertIteration(3);
        tree.insertIteration(20);
        tree.insertIteration(15);
        tree.insertIteration(7);

        assertTrue(BalancedBinaryTree.isBalanced(tree.root));
    }

    @Test
    void emptyTree(){
        assertTrue(BalancedBinaryTree.isBalanced(tree.root));
    }

    @Test
    void negativeTest(){
        tree.insertIteration(3);
        tree.insertIteration(2);
        tree.insertIteration(5);
        tree.insertIteration(7);
        tree.insertIteration(9);
        tree.insertIteration(10);
        tree.insertIteration(14);
        assertFalse(BalancedBinaryTree.isBalanced(tree.root));
    }

}