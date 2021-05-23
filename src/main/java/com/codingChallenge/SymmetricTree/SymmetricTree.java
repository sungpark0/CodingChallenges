package com.codingChallenge.SymmetricTree;

import com.codingChallenge.Tree.TreeNode;

public class SymmetricTree {

    public static boolean isSymmetric(TreeNode root) {
        return checker(root.left, root.right);
    }

    public static boolean checker(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null || rightNode == null) {
            return leftNode == rightNode;
        }

        if (leftNode.val != rightNode.val) return false;

        return checker(leftNode.left, rightNode.right) && checker(leftNode.right, rightNode.left);
    }

    public static void main(String[] args) {

    }
}
