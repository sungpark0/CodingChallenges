package com.codingChallenge.Tree;

public class DeepestLeavesSum extends BinarySearchTree {

    static int sum = 0;
    static int deepestLevel = 0;

    public static int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);

        return sum;
    }

    public static void dfs(TreeNode root, int level) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            if (deepestLevel < level) {
                deepestLevel = level;
                sum = root.val;
            } else if (deepestLevel == level) {
                sum += root.val;
            }
        }

        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }


    public static void main(String[] args) {

    }
}
