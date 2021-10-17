package com.codingChallenge.Tree;

public class CousinsInBinaryTree extends BinarySearchTree {

    static int level = 1;
    static TreeNode node = null;

    public static boolean isCousins(TreeNode root, int x, int y) {
        return dfs(root, x, y, 1, null);
    }

    public static boolean dfs(TreeNode root, int x, int y, int lvl, TreeNode parent) {
        if (root.val == x || root.val == y) {
            if (node != null && node != parent && level == lvl) return true;
            level = lvl;
            node = parent;
        }

        if (root.left != null && dfs(root.left, x, y, lvl + 1, root)) return true;
        if (root.right != null && dfs(root.right, x, y, lvl + 1, root)) return true;

        return false;
    }

    public static void main(String[] args) {

    }
}
