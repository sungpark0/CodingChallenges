package com.codingChallenge.Tree;

import com.codingChallenge.NaryTreePreorderTraversal.NaryTreePreorderTraversal;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePreOrderTraversalTest {

    BinaryTreePreOrderTraversal test = new BinaryTreePreOrderTraversal();

    @Test
    void positiveTest() {
        test.insertIteration(10);
        test.insertIteration(5);
        test.insertIteration(15);
        test.insertIteration(20);

        assertEquals(List.of(10, 5, 15, 20), BinaryTreePreOrderTraversal.preorderTraversal(test.root));
    }

    @Test
    void negativeTest() {
        test.insertRecursion(10);
        test.insertRecursion(5);
        test.insertRecursion(20);

        assertNotEquals(List.of(5, 10, 20), BinaryTreePreOrderTraversal.preorderTraversal(test.root));
    }

}