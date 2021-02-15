package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBinarySearchTreeTest {

    ValidateBinarySearchTree tree = new ValidateBinarySearchTree();

    @Test
    void positiveTest(){
        tree.insertRecursion(5);
        tree.insertRecursion(1);
        tree.insertRecursion(4);
        tree.insertRecursion(3);
        tree.insertRecursion(6);
        assertTrue(tree.isValidBST(tree.root));
    }

    @Test
    void edgeCase(){
        tree.insertRecursion(1);
        tree.insertRecursion(1);
        assertTrue(tree.isValidBST(tree.root));
    }

    @Test
    void positiveTestII(){
        tree.insertRecursion(15);
        tree.insertRecursion(10);
        tree.insertRecursion(5);
        tree.insertRecursion(17);
        tree.insertRecursion(20);
        assertTrue(tree.isValidBSTII(tree.root));
    }
    
}