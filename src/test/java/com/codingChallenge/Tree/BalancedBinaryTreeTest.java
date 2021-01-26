package com.codingChallenge.Tree;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BalancedBinaryTreeTest {

    BalancedBinaryTree tree = new BalancedBinaryTree();

    @Test
    @Order(1)
    void positiveTest() {
        tree.insertIteration(9);
        tree.insertIteration(3);
        tree.insertIteration(20);
        tree.insertIteration(15);
        tree.insertIteration(7);

        assertTrue(BalancedBinaryTree.isBalanced(tree.root));
    }

    @Test
    @Order(2)
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