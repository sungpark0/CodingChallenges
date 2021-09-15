package com.codingChallenge.Tree;

import java.util.*;

public class KthSmallestElementInABST extends BinarySearchTree {

    public static int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();

        inOrder(root, list);

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> a - b);

        heap.addAll(list);

        for (int i = 1; i < k; i++) {
            heap.remove();
        }

        return heap.peek();
    }

    public static void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        if (root.left != null) inOrder(root.left, list);
        list.add(root.val);
        if (root.right != null) inOrder(root.right, list);
    }

    public static void main(String[] args) {

    }
}
