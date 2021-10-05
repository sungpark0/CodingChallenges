package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfLevelsInBinaryTreeTest {

    AverageOfLevelsInBinaryTree test = new AverageOfLevelsInBinaryTree();

    @Test
    void positiveTest() {
        test.insertIteration(20);
        test.insertIteration(3);
        test.insertIteration(9);

        assertEquals(List.of(20.0, 3.0, 9.0), AverageOfLevelsInBinaryTree.averageOfLevels(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(10);
        test.insertIteration(5);

        assertNotEquals(List.of(7.5), AverageOfLevelsInBinaryTree.averageOfLevels(test.root));
    }

}