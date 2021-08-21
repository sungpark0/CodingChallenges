package com.codingChallenge.SumRootToLeafNumbers;

import com.codingChallenge.Tree.BinarySearchTree;
import com.codingChallenge.Tree.TreeNode;

public class SumRootToLeafNumbers extends BinarySearchTree {

    public static int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    public static int dfs(TreeNode root, int currentValue) {
        if (root == null) return 0;

        if (root.left == null && root.right == null) return root.val + currentValue;

        return dfs(root.left, (root.val + currentValue) * 10) + dfs(root.right, (root.val + currentValue) * 10);
    }

    public static void main(String[] args) {

    }
}
