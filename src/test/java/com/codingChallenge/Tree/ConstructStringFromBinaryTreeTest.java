package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructStringFromBinaryTreeTest {

    ConstructStringFromBinaryTree test = new ConstructStringFromBinaryTree();

    @Test
    void positiveTest() {
        test.insertIteration(3);
        test.insertIteration(1);
        test.insertIteration(2);
        test.insertIteration(4);

        assertEquals("3(1()(2))(4)", ConstructStringFromBinaryTree.tree2str(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(1);
        test.insertIteration(4);
        test.insertIteration(6);

        assertNotEquals("1((4)6)", ConstructStringFromBinaryTree.tree2str(test.root));
    }

}