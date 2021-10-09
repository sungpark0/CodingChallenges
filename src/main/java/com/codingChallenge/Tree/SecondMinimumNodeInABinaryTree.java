package com.codingChallenge.Tree;

import java.util.PriorityQueue;

public class SecondMinimumNodeInABinaryTree extends BinarySearchTree {

    public static int findSecondMinimumValue(TreeNode root) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> a - b);

        preorder(root, minHeap);

        minHeap.remove();

        return minHeap.size() < 1 ? -1 : minHeap.remove();
    }

    public static void preorder(TreeNode root, PriorityQueue<Integer> heap) {
        if (root == null) return;

        if (!heap.contains(root.val)) heap.add(root.val);
        preorder(root.left, heap);
        preorder(root.right, heap);
    }


    public static void main(String[] args) {

    }
}
