package com.codingChallenge.SubtreeOfAnotherTree;

import com.codingChallenge.Tree.BinarySearchTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubtreeOfAnotherTreeTest {

    BinarySearchTree root = new BinarySearchTree();
    BinarySearchTree subRoot = new BinarySearchTree();

    @Test
    void positiveTest(){
        root.insertIteration(5);
        root.insertIteration(3);
        root.insertIteration(1);
        root.insertIteration(4);
        root.insertIteration(7);

        subRoot.insertIteration(3);
        subRoot.insertIteration(1);
        subRoot.insertIteration(4);
        assertTrue(SubtreeOfAnotherTree.isSubtree(root, subRoot));
    }

    @Test
    void positiveTestII(){
        root.insertIteration(5);
        root.insertIteration(10);
        root.insertIteration(15);
        root.insertIteration(12);
        root.insertIteration(20);

        subRoot.insertIteration(15);
        subRoot.insertIteration(12);
        subRoot.insertIteration(20);
        assertTrue(SubtreeOfAnotherTree.isSubtree(root, subRoot));
    }

}