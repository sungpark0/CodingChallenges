package com.codingChallenge.SymmetricTree;

import com.codingChallenge.Tree.BinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    BinarySearchTree test = new BinarySearchTree();

    @Test
    void positiveTest(){
        test.insertIteration(3);
        assertTrue(SymmetricTree.isSymmetric(test));
    }

}