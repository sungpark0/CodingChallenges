package com.codingChallenge.PathSumII;

import com.codingChallenge.Tree.BinarySearchTree;
import com.codingChallenge.Tree.TreeNode;

import java.util.*;

public class PathSumII extends BinarySearchTree {

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();

        dfs(root, ans, targetSum, new ArrayList<Integer>());

        return ans;
    }

    public static void dfs(TreeNode root, List<List<Integer>> ans, int currSum, List<Integer> currList) {
        if (root == null) return;

        currList.add(root.val);

        if (root.left == null && root.right == null && currSum - root.val == 0) {
            List<Integer> temp = new ArrayList(currList);
            ans.add(temp);
        }

        dfs(root.left, ans, currSum - root.val, currList);
        dfs(root.right, ans, currSum - root.val, currList);
        currList.remove(currList.size() - 1);
    }

    public static void main(String[] args) {

    }
}
