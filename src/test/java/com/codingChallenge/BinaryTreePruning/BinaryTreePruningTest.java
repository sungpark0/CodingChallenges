package com.codingChallenge.BinaryTreePruning;

import com.codingChallenge.Tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BinaryTreePruningTest {

    BinaryTreePruning test = new BinaryTreePruning();

    @Test
    void positiveTest() {
        test.insertIteration(1);
        test.insertIteration(0);
        test.insertIteration(1);
        test.insertIteration(1);
//        TreeNode root = BinaryTreePruning.pruneTree(test.root);
        List<Integer> list = new ArrayList<>();
        inorderTraversal(test.root);
        System.out.println(list);
    }

    public static void inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) return;
        inOrder(root, result);

    }

    public static void inOrder(TreeNode node, List<Integer> list) {
        if (node.left != null) inOrder(node.left, list);
        list.add(node.val);
        if (node.right != null) inOrder(node.right, list);
    }

}