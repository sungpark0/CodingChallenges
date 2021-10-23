package com.codingChallenge.MinimumDepthOfBinaryTree;

import com.codingChallenge.Tree.BinarySearchTree;
import com.codingChallenge.Tree.TreeNode;

import java.util.*;

public class MinimumDepthOfBinaryTree extends BinarySearchTree {

    public static int minDepth(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static int minDepthII(TreeNode root) {
        if (root == null) return 0;

        int min = Integer.MAX_VALUE;
        int currMin = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            currMin++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = queue.remove();

                if (currNode.left != null) queue.add(currNode.left);
                if (currNode.right != null) queue.add(currNode.right);

                if (currNode.left == null && currNode.right == null) min = Math.min(min, currMin);
            }
        }

        return min;
    }

    public static void main(String[] args) {

    }
}
