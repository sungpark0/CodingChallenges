package com.codingChallenge.Tree;

import java.util.*;

public class BinaryTreeLevelOrderTraversal extends BinarySearchTree {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return List.of();

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                temp.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(temp);
        }

        return result;
    }

    public static List<List<Integer>> levelOrderII(TreeNode root) {
        if (root == null) return List.of();

        List<List<Integer>> orderList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                list.add(node.val);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            orderList.add(list);
        }

        return orderList;
    }

    public static void main(String[] args) {

    }
}
