package com.codingChallenge.PopulatingNextRightPointersInEachNode;

import com.codingChallenge.Tree.BinaryTreeInOrderTraversal;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PopulatingNextRightPointersInEachNodeTest {

    PopulatingNextRightPointersInEachNode test = new PopulatingNextRightPointersInEachNode();

    @Test
    void positiveTest() {
        test.insertIteration(15);
        test.insertIteration(10);
        test.insertIteration(5);
        test.insertIteration(20);
        test.insertIteration(25);
        List<Integer> list = new ArrayList<>();
        BinaryTreeInOrderTraversal.inOrder(test.root, list);

        assertEquals(List.of(5, 10, 15, 20, 25), list);
    }

    @Test
    void negativeTest() {
        test.insertIteration(1);
        test.insertIteration(4);
        test.insertIteration(7);
        List<Integer> list = new ArrayList<>();
        BinaryTreeInOrderTraversal.inOrder(test.root, list);

        assertNotEquals(List.of(4, 1, 7), list);
    }

}