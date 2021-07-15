package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTreeTest {

    EvenOddTree test = new EvenOddTree();

    @Test
    void negativeTest() {
        test.insertIteration(1);
        test.insertIteration(10);
        test.insertIteration(4);
        assertFalse(EvenOddTree.isEvenOddTree(test.root));
    }
}