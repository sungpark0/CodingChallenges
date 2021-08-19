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

    @Test
    void positiveTestII() {
        tree.insertIteration(9);
        tree.insertIteration(3);
        tree.insertIteration(20);
        tree.insertIteration(15);
        tree.insertIteration(7);

        assertTrue(BalancedBinaryTree.isBalancedII(tree.root));
    }
    @Test
    void negativeTestII(){
        tree.insertIteration(3);
        tree.insertIteration(2);
        tree.insertIteration(5);
        tree.insertIteration(7);
        tree.insertIteration(9);
        tree.insertIteration(10);
        tree.insertIteration(14);
        assertFalse(BalancedBinaryTree.isBalancedII(tree.root));
    }

    @Test
    void positiveTestReview(){
        tree.insertRecursion(20);
        tree.insertRecursion(10);
        tree.insertRecursion(15);
        tree.insertRecursion(7);
        tree.insertRecursion(25);
        assertTrue(BalancedBinaryTree.isBalanced(tree.root));
    }

    @Test
    void negativeTestReview(){
        tree.insertRecursion(15);
        tree.insertRecursion(6);
        tree.insertRecursion(17);
        tree.insertRecursion(4);
        tree.insertRecursion(2);
        assertFalse(BalancedBinaryTree.isBalanced(tree.root));
    }

    @Test
    void positiveTestIII() {
        tree.insertIteration(10);
        tree.insertIteration(5);
        tree.insertIteration(120);
        tree.insertIteration(155);

        assertTrue(BalancedBinaryTree.isBalancedIII(tree.root));
    }

    @Test
    void negativeTestIII() {
        tree.insertIteration(10);
        tree.insertIteration(5);
        tree.insertIteration(15);
        tree.insertIteration(20);
        tree.insertIteration(25);
        tree.insertIteration(30);

        assertFalse(BalancedBinaryTree.isBalancedIII(tree.root));
    }


}