package com.codingChallenge.Tree;

import java.util.*;

public class BinaryTreePreOrderTraversal extends BinarySearchTree {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) return result;

        preOrder(root, result);
        return result;
    }

    public static void preOrder(TreeNode node, List<Integer> list) {
        list.add(node.val);
        if (node.left != null) preOrder(node.left, list);
        if (node.right != null) preOrder(node.right, list);

    }
}
