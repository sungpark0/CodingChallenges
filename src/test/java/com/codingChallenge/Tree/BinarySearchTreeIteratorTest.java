package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeIteratorTest {

    BinarySearchTreeIterator tree = new BinarySearchTreeIterator();

    @Test
    void positiveTest() {
        tree.insertIteration(7);
        tree.insertIteration(3);
        tree.insertIteration(15);
        tree.insertIteration(9);
        Queue<Integer> queue = new LinkedList<>();
        BinarySearchTreeIterator.inOrderTraversal(tree.root, queue);
        Queue<Integer> test = new LinkedList<>();
        test.add(3);
        test.add(7);
        test.add(9);
        test.add(15);
        assertEquals(test, queue);
    }

    @Test
    void negativeTest() {
        assertFalse(BinarySearchTreeIterator.hasNext());
    }

}