package com.codingChallenge.Tree;

public class BalancedBinaryTree extends BinarySearchTree {

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

    public static boolean isBalncedII(TreeNode root) {
        if (root == null) return true;

        if (Math.abs(LengthII(root.left) - LengthII(root.right)) > 1) return false;

        return isBalncedII(root.left) && isBalncedII(root.right);
    }

    public static int LengthII(TreeNode node) {
        if (node == null) return 0;

        return 1 + Math.max(LengthII(node.left), LengthII(node.right));
    }

    public static void main(String[] args) {

    }
}
