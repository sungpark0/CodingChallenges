package com.codingChallenge.InvertBinaryTree;

import com.codingChallenge.Tree.BinarySearchTree;
import com.codingChallenge.Tree.TreeNode;

public class InvertBinaryTree extends BinarySearchTree {

    public static TreeNode invertTree(TreeNode root) {
        helper(root);

        return root;
    }

    public static void helper(TreeNode root) {
        if (root == null) return;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        helper(root.left);
        helper(root.right);
    }

    public static void main(String[] args) {

    }
}
