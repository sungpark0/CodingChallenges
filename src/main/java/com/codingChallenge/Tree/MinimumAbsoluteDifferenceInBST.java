package com.codingChallenge.Tree;

import java.util.*;

public class MinimumAbsoluteDifferenceInBST extends BinarySearchTree {

    public static int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        inorder(root, list);
        Collections.sort(list);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < list.size() - 1; i++) {
            minDiff = Math.min(minDiff, Math.abs(list.get(i) - list.get(i + 1)));
        }

        return minDiff;
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
