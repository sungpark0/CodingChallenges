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
        //256
        int[] ee = new int[]{13, 9, 9, 13, 15, 3, 10, 16};
        int cb = Integer.MIN_VALUE;

        for (int i = 0; i < ee.length - 1; i++) {
            if (ee[i] * ee[i + 1] > cb) {
                cb = ee[i] * ee[i + 1];
            }
        }
        //1 3 5 7
        System.out.println((1 * 2 * 3 * 5 * 7) % 8);

    }
}
