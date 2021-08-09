package com.codingChallenge.MaxiumumDepthOfBinaryTree;

import com.codingChallenge.Tree.BinarySearchTree;
import com.codingChallenge.Tree.TreeNode;

public class MaximumDepthOfBinaryTree extends BinarySearchTree {

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null) return maxDepth(root.right) + 1;
        if (root.right == null) return maxDepth(root.left) + 1;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {

    }
}
