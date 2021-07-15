package com.codingChallenge.Tree;

import java.util.*;

public class EvenOddTree extends BinarySearchTree {

    public static boolean isEvenOddTree(TreeNode root) {
        if (root == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        int prev = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = queue.remove();
                if (level % 2 == 0) {
                    if ((currNode.val % 2 == 0) || (i > 0 && currNode.val <= prev)) {
                        return false;
                    }
                } else {
                    if ((currNode.val % 2 != 0) || (i > 0 && currNode.val >= prev)) {
                        return false;
                    }
                }
                prev = currNode.val;
                if (currNode.left != null) queue.add(currNode.left);
                if (currNode.right != null) queue.add(currNode.right);
            }

            level++;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
