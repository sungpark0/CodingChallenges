package com.codingChallenge.Tree;

public class ConstructStringFromBinaryTree extends BinarySearchTree {

    public static String tree2str(TreeNode root) {
        if (root == null) return "";

        StringBuilder sb = new StringBuilder();
        dfs(root, sb);

        return sb.toString();
    }

    public static void dfs(TreeNode root, StringBuilder sb) {
        if (root == null) return;

        sb.append(root.val);

        if (root.left == null && root.right == null) return;

        sb.append("(");
        dfs(root.left, sb);
        sb.append(")");

        if (root.right != null) {
            sb.append("(");
            dfs(root.right, sb);
            sb.append(")");
        }
    }

    public static void main(String[] args) {

    }
}
