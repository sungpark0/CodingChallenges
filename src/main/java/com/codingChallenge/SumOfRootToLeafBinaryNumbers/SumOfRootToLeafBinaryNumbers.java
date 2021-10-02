package com.codingChallenge.SumOfRootToLeafBinaryNumbers;

import com.codingChallenge.Tree.BinarySearchTree;
import com.codingChallenge.Tree.TreeNode;

public class SumOfRootToLeafBinaryNumbers extends BinarySearchTree {

    private static int sum = 0;

    public static int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);

        return sum;
    }

    public static void dfs(TreeNode root, int prevSum) {
        int currSum = prevSum * 2 + root.val;

        if (root.left == null && root.right == null) {
            sum += currSum;
            return;
        }

        if (root.left != null) dfs(root.left, currSum);
        if (root.right != null) dfs(root.right, currSum);
    }

    public static void main(String[] args) {

    }
}
