package com.codingChallenge.Tree;

import java.util.*;

public class FindModeInBinarySearchTree extends BinarySearchTree {

    static int highest = Integer.MIN_VALUE;

    public static int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        inorder(root, map);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == highest) list.add(entry.getKey());
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static void inorder(TreeNode root, Map<Integer, Integer> map) {
        if (root == null) return;

        inorder(root.left, map);
        int counter = map.getOrDefault(root.val, 0);
        highest = Math.max(highest, counter + 1);

        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        inorder(root.right, map);
    }

    public static void main(String[] args) {

    }
}
