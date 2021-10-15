package com.codingChallenge.Tree;

public class BinaryTreeTilt extends BinarySearchTree {

    static int sum = 0;

    public static int findTilt(TreeNode root) {
        dfs(root);

        return sum;
    }

    public static int dfs(TreeNode root) {
        if (root == null) return 0;

        int leftSide = dfs(root.left);
        int rightSide = dfs(root.right);

        sum += Math.abs(leftSide - rightSide);

        return leftSide + rightSide + root.val;
    }

    public static void main(String[] args) {

    }
}
