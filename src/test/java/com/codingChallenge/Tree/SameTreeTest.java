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

    SameTree testOne = new SameTree();
    SameTree testTwo = new SameTree();

    @Test
    void positiveTestII(){
        testOne.insertRecursion(10);
        testOne.insertRecursion(15);
        testOne.insertRecursion(5);

        testTwo.insertRecursion(10);
        testTwo.insertRecursion(15);
        testTwo.insertRecursion(5);

        assertTrue(SameTree.isSameTree(testOne.root, testTwo.root));
    }

    @Test
    void negativeTestII(){
        testOne.insertRecursion(5);
        testOne.insertRecursion(10);

        testTwo.insertRecursion(5);
        testTwo.insertRecursion(1);
        testTwo.insertRecursion(7);

        assertFalse(SameTree.isSameTree(testOne.root, testTwo.root));
    }


}