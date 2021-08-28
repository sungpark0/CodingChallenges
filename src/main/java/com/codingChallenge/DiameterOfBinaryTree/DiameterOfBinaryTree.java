package com.codingChallenge.DiameterOfBinaryTree;

import com.codingChallenge.Tree.BinarySearchTree;
import com.codingChallenge.Tree.TreeNode;

public class DiameterOfBinaryTree extends BinarySearchTree {

    static int diameter = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
        length(root);

        return diameter;
    }

    public static int length(TreeNode root) {
        if (root == null) return 0;

        int left = length(root.left);
        int right = length(root.right);

        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

    }
}
