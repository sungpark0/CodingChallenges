package com.codingChallenge.Tree;

public class CountGoodNodesInBinaryTree extends BinarySearchTree {

    static int counter = 0;

    public static int goodNodes(TreeNode root) {
        if (root == null) return 0;

        dfs(root, root.val);

        return counter;
    }

    public static void dfs(TreeNode root, int value) {
        if (root == null) return;

        if (root.val >= value) {
            value = root.val;
            counter++;
        }

        dfs(root.left, value);
        dfs(root.right, value);
    }

    public static void main(String[] args) {

    }
}
