package com.codingChallenge.BinaryTreePruning;

import com.codingChallenge.Tree.BinarySearchTree;
import com.codingChallenge.Tree.TreeNode;

public class BinaryTreePruning extends BinarySearchTree {

    //      Definition for a binary tree node.

    public static TreeNode pruneTree(TreeNode root) {
        if (root == null) return null;

        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);

        if (root.left == null && root.right == null && root.val == 0) return null;

        return root;
    }

    public static void main(String[] args) {

    }
}
