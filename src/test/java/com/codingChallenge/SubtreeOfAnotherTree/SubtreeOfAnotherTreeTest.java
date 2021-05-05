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

}