package com.codingChallenge.Tree;

import java.util.*;

public class UniqueBinarySearchTreesII {

    public static List<TreeNode> generateTrees(int n) {
        if (n == 0) return new LinkedList<TreeNode>();

        return generateSubtree(1, n);
    }

    public static List<TreeNode> generateSubtree(int start, int end) {
        List<TreeNode> allTrees = new LinkedList<>();

        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftTree = generateSubtree(start, i - 1);
            List<TreeNode> rightTree = generateSubtree(i + 1, end);
            for (TreeNode left : leftTree) {
                for (TreeNode right : rightTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;

                    allTrees.add(root);
                }
            }
        }
        return allTrees;
    }

    public static void main(String[] args) {

    }
}
