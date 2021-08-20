package com.codingChallenge.FlattenBinaryTreeToLinkedList;

import com.codingChallenge.Tree.BalancedBinaryTree;
import com.codingChallenge.Tree.TreeNode;

public class FlattenBinaryTreeToLinkedList extends BalancedBinaryTree {

    public static void flatten(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return;

        if (root.left != null) {
            flatten(root.left);

            TreeNode temp = root.right;
            root.right = root.left;
            root.left = null;

            while (root.right != null) {
                root = root.right;
            }

            root.right = temp;
        }

        flatten(root.right);
    }

    public static void main(String[] args) {

    }
}
