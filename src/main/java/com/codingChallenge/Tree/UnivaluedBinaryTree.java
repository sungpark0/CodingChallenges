package com.codingChallenge.Tree;

public class UnivaluedBinaryTree extends BinarySearchTree {

    public static boolean isUnivalTree(TreeNode root) {
        int value = root.val;

        return dfs(root, value);
    }

    public static boolean dfs(TreeNode root, int value) {
        if (root == null) return true;

        if (root.val != value) return false;

        return dfs(root.left, value) && dfs(root.right, value);
    }


    public static void main(String[] args) {

    }
}
