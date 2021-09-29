package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingOrderSearchTreeTest {

    IncreasingOrderSearchTree test = new IncreasingOrderSearchTree();

    @Test
    void positiveTest() {
        test.insertIteration(5);
        test.insertIteration(3);
        test.insertIteration(6);
        test.insertIteration(2);
        test.insertIteration(4);
        test.insertIteration(1);
        test.insertIteration(8);
        test.insertIteration(7);
        test.insertIteration(9);

        List<Integer> list = new ArrayList<>();
        IncreasingOrderSearchTree.inorder(IncreasingOrderSearchTree.increasingBST(test.root), list);

        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), list);
    }

    @Test
    void negativeTest() {
        test.insertIteration(1);
        test.insertIteration(2);
        test.insertIteration(5);
        test.insertIteration(6);


        List<Integer> list = new ArrayList<>();
        IncreasingOrderSearchTree.inorder(IncreasingOrderSearchTree.increasingBST(test.root), list);

        assertNotEquals(List.of(1, 5, 6), list);
    }

}