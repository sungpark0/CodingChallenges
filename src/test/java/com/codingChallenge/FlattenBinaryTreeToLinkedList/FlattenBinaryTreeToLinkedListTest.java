package com.codingChallenge.FlattenBinaryTreeToLinkedList;

import com.codingChallenge.Tree.BinaryTreeInOrderTraversal;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FlattenBinaryTreeToLinkedListTest {

    FlattenBinaryTreeToLinkedList test = new FlattenBinaryTreeToLinkedList();

    @Test
    void positiveTest() {
        test.insertIteration(5);
        FlattenBinaryTreeToLinkedList.flatten(test.root);
        List<Integer> list = new ArrayList<>();
        BinaryTreeInOrderTraversal.inOrder(test.root, list);

        assertEquals(List.of(5), list);
    }

}