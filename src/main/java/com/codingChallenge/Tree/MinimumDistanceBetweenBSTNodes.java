package com.codingChallenge.Tree;

import java.util.ArrayList;
import java.util.List;

public class MinimumDistanceBetweenBSTNodes extends BinarySearchTree{

    public static int minDiffInBST(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        int minValue = Integer.MAX_VALUE;
        InOrderList(root, list);

        for (int i = 0; i < list.size() - 1; i++) {
            if ((list.get(i + 1) - list.get(i)) < minValue) {
                minValue = list.get(i + 1) - list.get(i);
            }
        }

        return minValue;
    }

    public static void InOrderList(TreeNode node, List<Integer> list) {
        if (node == null) return;

        list.add(node.val);
        if (node.left != null) InOrderList(node.left, list);
        if (node.right != null) InOrderList(node.right, list);
    }

    public static void main(String[] args) {

    }
}
