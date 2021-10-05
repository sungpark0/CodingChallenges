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

    public static void main(String[] args) {

    }
}
