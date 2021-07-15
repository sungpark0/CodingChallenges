package com.codingChallenge.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeIterator extends BinarySearchTree {

    private static final Queue<Integer> queue = new LinkedList<>();

    public BinarySearchTreeIterator() {

    }
    public BinarySearchTreeIterator(TreeNode root) {
        inOrderTraversal(root, queue);
    }

    public static void inOrderTraversal(TreeNode root, Queue<Integer> queue) {
        if (root == null) return;

        inOrderTraversal(root.left, queue);
        queue.add(root.val);
        inOrderTraversal(root.right, queue);
    }

    public static int next() {
        return queue.remove();
    }

    public static boolean hasNext() {
        return !queue.isEmpty();
    }

    public static void main(String[] args) {

    }
}
