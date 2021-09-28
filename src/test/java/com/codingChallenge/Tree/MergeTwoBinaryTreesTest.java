package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoBinaryTreesTest {

    MergeTwoBinaryTrees testOne = new MergeTwoBinaryTrees();
    MergeTwoBinaryTrees testTwo = new MergeTwoBinaryTrees();

    @Test
    void negativeTest() {
        testOne.insertIteration(1);
        testOne.insertIteration(3);
        testOne.insertIteration(2);
        testOne.insertIteration(5);

        testTwo.insertIteration(1);
        testTwo.insertIteration(2);

        assertNotEquals(List.of(2, 3, 4, 5), BinaryTreeInOrderTraversal.inorderTraversal(MergeTwoBinaryTrees.mergeTrees(testOne, testTwo)));
    }
}