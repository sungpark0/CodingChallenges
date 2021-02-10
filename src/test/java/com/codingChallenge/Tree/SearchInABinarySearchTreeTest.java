package com.codingChallenge.Tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchInABinarySearchTreeTest {

    SearchInABinarySearchTree tree = new SearchInABinarySearchTree();

    @Test
    void positiveTest() {
        tree.insertRecursion(6);
        tree.insertRecursion(4);
        tree.insertRecursion(8);
        tree.insertRecursion(3);
        tree.insertRecursion(5);

        TreeNode temp = SearchInABinarySearchTree.searchBST(tree.root, 4);
        List<Integer> test = new ArrayList<>();
        InOrderTraversalToList(temp, test);
        assertEquals(List.of(3, 4, 5), test);
    }

    @Test
    void negativeTest() {
        tree.insertRecursion(10);
        tree.insertRecursion(5);
        tree.insertRecursion(15);
        tree.insertRecursion(8);

        assertNull(SearchInABinarySearchTree.searchBST(tree.root, 7));
    }

    public void InOrderTraversalToList(TreeNode root, List<Integer> list) {
        if (root == null) return;

        if (root.left != null) InOrderTraversalToList(root.left, list);
        list.add(root.val);
        if (root.right != null) InOrderTraversalToList(root.right, list);
    }
}