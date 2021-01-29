package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    BinarySearchTree tree = new BinarySearchTree();

    @Test
    void positiveTest() {
        tree.insertRecursionIII(5);
        tree.insertRecursionIII(2);
        tree.insertRecursionIII(7);
        tree.insertRecursionIII(6);
        tree.insertRecursionIII(1);

        List<Integer> test = new ArrayList<>();
        preOrderToList(test, tree.root);
        assertEquals(List.of(5, 2, 1, 7, 6), test);
    }

    @Test
    void negativeTest() {
        tree.insertRecursionIII(3);
        tree.insertRecursionIII(1);
        tree.insertRecursionIII(2);
        tree.insertRecursionIII(4);
        List<Integer> test = new ArrayList<>();
        preOrderToList(test, tree.root);
        assertNotEquals(List.of(1, 2, 3, 4), test);
    }

    public List<Integer> preOrderToList(List<Integer> list, TreeNode node) {
        list.add(node.val);
        if (node.left != null) preOrderToList(list, node.left);
        if (node.right != null) preOrderToList(list, node.right);

        return list;
    }

}