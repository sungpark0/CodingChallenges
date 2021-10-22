package com.codingChallenge.Tree;

import java.util.*;

public class FindElementsInAContaminatedBinaryTree extends BinarySearchTree {

    static Set<Integer> set = new HashSet<>();

    public FindElementsInAContaminatedBinaryTree(TreeNode root) {
        helper(root, 0);
    }

    public static boolean find(int target) {
        return set.contains(target);
    }

    public static void helper(TreeNode root, int x) {
        if (root == null) return;

        set.add(x);

        helper(root.left, 2 * x + 1);
        helper(root.right, 2 * x + 2);

    }

    public static void main(String[] args) {

    }
}
