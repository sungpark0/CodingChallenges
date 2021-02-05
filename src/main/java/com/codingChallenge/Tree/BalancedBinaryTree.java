package com.codingChallenge.Tree;

public class BalancedBinaryTree extends BinarySearchTree {

    public boolean isBalancedOptimalWay(TreeNode root) {
        if (root == null) return true;

        return recurse(root) != -1;
    }

    public int recurse(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = recurse(node.left);
        int rightHeight = recurse(node.right);

        if (Math.abs(leftHeight - rightHeight) > 1 || leftHeight == -1 || rightHeight == -1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }


    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftChecker = Length(root.left);
        int rightChecker = Length(root.right);
        if (Math.abs(leftChecker - rightChecker) > 1) return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static int Length(TreeNode node) {
        if (node == null) return 0;
        int left = Length(node.left);
        int right = Length(node.right);

        return 1 + Math.max(left, right);
    }

    public static boolean isBalancedII(TreeNode root) {
        if (root == null) return true;

        if (Math.abs(LengthII(root.left) - LengthII(root.right)) > 1) return false;

        return isBalancedII(root.left) && isBalancedII(root.right);
    }

    public static int LengthII(TreeNode node) {
        if (node == null) return 0;

        return 1 + Math.max(LengthII(node.left), LengthII(node.right));
    }

    public static void main(String[] args) {

    }
}
