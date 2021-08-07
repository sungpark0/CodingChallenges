package com.codingChallenge.MinimumDepthOfBinaryTree;

import com.codingChallenge.Tree.BinarySearchTree;
import com.codingChallenge.Tree.TreeNode;

public class MinimumDepthOfBinaryTree extends BinarySearchTree {

    public static int minDepth(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static void main(String[] args) {

    }
}
