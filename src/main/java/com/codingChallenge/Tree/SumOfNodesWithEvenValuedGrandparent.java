package com.codingChallenge.Tree;

public class SumOfNodesWithEvenValuedGrandparent extends BinarySearchTree {

    static int sum = 0;

    public static int sumEvenGrandparent(TreeNode root) {

        dfs(root, root.left);
        dfs(root, root.right);

        return sum;
    }

    public static void dfs(TreeNode root, TreeNode parent) {
        if (root == null || parent == null) return;

        if (root.val % 2 == 0) {
            sum += parent.left != null ? parent.left.val : 0;
            sum += parent.right != null ? parent.right.val : 0;
        }

        dfs(parent, parent.left);
        dfs(parent, parent.right);
    }

    public static void main(String[] args) {

    }
}
