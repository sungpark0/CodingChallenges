package com.codingChallenge.Tree;

import java.util.*;

public class TwoSumIVInputIsABST extends BinarySearchTree {

    public static boolean findTarget(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();

        inorder(root, values);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < values.size(); i++) {
            int diff = k - values.get(i);

            if (map.containsKey(diff)) {
                return true;
            }

            map.put(values.get(i), i);
        }

        return false;
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
