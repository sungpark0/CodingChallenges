package com.codingChallenge.Tree;

public class RecoverBinarySearchTree extends BinarySearchTree {

    static TreeNode prev = null;
    static TreeNode first = null;
    static TreeNode second = null;

    public static void recoverTree(TreeNode root) {
        helper(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public static void helper(TreeNode root) {
        if (root == null) return;

        helper(root.left);

        if (prev != null && root.val < prev.val) {
            if (first == null) {
                first = prev;
            }
            second = root;
        }

        prev = root;
        helper(root.right);
    }

    public static void main(String[] args) {

    }
}
