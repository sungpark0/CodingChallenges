package com.codingChallenge.Tree;

import java.util.*;

public class BinaryTreeLevelOrderTraversalII extends BinarySearchTree {

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return List.of();

        List<List<Integer>> list = new ArrayList<>();
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

            list.add(temp);
        }

        Collections.reverse(list);

        return list;
    }

    public static void main(String[] args) {

    }
}
