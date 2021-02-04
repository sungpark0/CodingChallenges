package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumDistanceBetweenBSTNodesTest {

    MinimumDistanceBetweenBSTNodes tree = new MinimumDistanceBetweenBSTNodes();

    @Test
    void positiveTest(){
        tree.insertRecursion(4);
        tree.insertRecursion(2);
        tree.insertRecursion(6);
        tree.insertRecursion(1);
        tree.insertRecursion(3);
        assertEquals(1,MinimumDistanceBetweenBSTNodes.minDiffInBST(tree.root));
    }

    @Test
    void negativeTest(){
        tree.insertRecursion(4);
        tree.insertRecursion(1);
        tree.insertRecursion(8);
        assertNotEquals(4,MinimumDistanceBetweenBSTNodes.minDiffInBST(tree.root));
    }

}