package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConvertSortedArrayToBinanrySearchTreeTest {

    ConvertSortedArrayToBinanrySearchTree tree = new ConvertSortedArrayToBinanrySearchTree();

    @Test
    void positiveTest() {
        tree.insertRecursion(5);
        tree.insertRecursion(4);
        tree.insertRecursion(9);
        tree.insertRecursion(12);
        tree.insertRecursion(2);
        List<Integer> test = BinaryTreeInOrderTraversal.inorderTraversal(tree.root);
        int[] arr = new int[]{2, 4, 5, 9, 12};
        TreeNode result = ConvertSortedArrayToBinanrySearchTree.sortedArrayToBST(arr);
        List<Integer> temp = BinaryTreeInOrderTraversal.inorderTraversal(result);

        assertEquals(test, temp);
    }

    @Test
    void negativeTest() {
        tree.insertRecursion(1);
        tree.insertRecursion(2);
        tree.insertRecursion(3);
        List<Integer> test = BinaryTreeInOrderTraversal.inorderTraversal(tree.root);
        int[] arr = new int[]{3, 1, 2};
        TreeNode result = ConvertSortedArrayToBinanrySearchTree.sortedArrayToBST(arr);
        List<Integer> temp = BinaryTreeInOrderTraversal.inorderTraversal(result);

        assertNotEquals(test, temp);
    }


}