package com.codingChallenge.Tree;

import java.util.*;

public class IncreasingOrderSearchTree extends BinarySearchTree {

    public static TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);

        TreeNode node = new TreeNode(list.get(0));
        TreeNode currNode = node;

        for (int i = 1; i < list.size(); i++) {
            currNode.right = new TreeNode(list.get(i));
            currNode = currNode.right;
        }

        return node;
    }

    public static void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public static void main(String[] args) {

    }
}
