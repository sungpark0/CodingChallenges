package com.codingChallenge.Tree;

public class SumOfLeftLeaves extends BinarySearchTree {

    static int sum = 0;

    public static int sumOfLeftLeaves(TreeNode root) {

        dfs(root);

        return sum;
    }

    public static void dfs(TreeNode root) {
        if (root == null) return;

        if (root.left != null && root.left.left == null && root.left.right == null) sum += root.left.val;

        dfs(root.left);
        dfs(root.right);
    }

    public static void main(String[] args) {

    }
}
