package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    SameTree treeOne = new SameTree();
    SameTree treeTwo = new SameTree();

    @Test
    void positiveTest(){
        treeOne.insertRecursion(2);
        treeOne.insertRecursion(1);
        treeOne.insertRecursion(3);
        treeOne.insertRecursion(4);

        treeTwo.insertRecursion(2);
        treeTwo.insertRecursion(1);
        treeTwo.insertRecursion(3);
        treeTwo.insertRecursion(4);

        assertTrue(SameTree.isSameTree(treeOne.root, treeTwo.root));
    }

    @Test
    void negativeTest(){
        treeOne.insertRecursion(5);
        treeOne.insertRecursion(2);
        treeOne.insertRecursion(7);

        treeTwo.insertRecursion(5);
        treeTwo.insertRecursion(1);
        treeTwo.insertRecursion(2);


        assertFalse(SameTree.isSameTree(treeOne.root, treeTwo.root));
    }

}