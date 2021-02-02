package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumOfBSTTest {

    RangeSumOfBST tree = new RangeSumOfBST();

    @Test
    void positiveTest(){
        tree.insertRecursion(5);
        tree.insertRecursion(2);
        tree.insertRecursion(4);
        tree.insertRecursion(9);
        tree.insertRecursion(12);
        tree.insertRecursion(14);
        tree.insertRecursion(13);

        assertEquals(30, RangeSumOfBST.rangeSumBSTII(tree.root, 4,12));
    }

    @Test
    void negativeTest(){
        tree.insertRecursion(1);
        tree.insertRecursion(2);
        tree.insertRecursion(3);
        tree.insertRecursion(6);

        assertNotEquals(12, RangeSumOfBST.rangeSumBSTII(tree.root, 1,5));
    }

}