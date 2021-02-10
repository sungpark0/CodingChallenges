package com.codingChallenge.Tree;

public class SearchInABinarySearchTree extends BinarySearchTree {

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;

        if (val < root.val) return searchBST(root.left, val);

        return searchBST(root.right, val);
    }

    public static void main(String[] args) {

    }
}
