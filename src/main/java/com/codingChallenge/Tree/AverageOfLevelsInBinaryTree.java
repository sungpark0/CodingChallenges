package com.codingChallenge.Tree;

import java.util.*;

public class AverageOfLevelsInBinaryTree extends BinarySearchTree {

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<>();

        if (root == null) return averages;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode currNode = queue.remove();
                sum += currNode.val;

                if (currNode.left != null) queue.add(currNode.left);
                if (currNode.right != null) queue.add(currNode.right);
            }

            averages.add(sum / size);
        }

        return averages;
    }

    public List<Double> averageOfLevelsDFS(TreeNode root) {
        List<Double> averages = new ArrayList<>();

        if (root == null) return averages;

        List<List<Integer>> levelSum = new ArrayList<>();
        dfs(root, levelSum, 0);

        for (int i = 0; i < levelSum.size(); i++) {
            double sum = 0;
            for (int j = 0; j < levelSum.get(i).size(); j++) {
                sum += levelSum.get(i).get(j);
            }
            averages.add(sum / levelSum.get(i).size());
        }

        return averages;
    }

    public void dfs(TreeNode root, List<List<Integer>> levelSum, int level) {
        if (root == null) return;

        if (levelSum.size() == level) {
            levelSum.add(new ArrayList());
        }

        levelSum.get(level).add(root.val);

        dfs(root.left, levelSum, level + 1);
        dfs(root.right, levelSum, level + 1);
    }

    public static void main(String[] args) {

    }
}
