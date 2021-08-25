package com.codingChallenge.Tree;

import java.util.ArrayList;
import java.util.List;

public class RangeSumOfBST extends BinarySearchTree {

    static int sum = 0;

    // List<Integer> list = new ArrayList<>();
    public int rangeSumBST(TreeNode node, int low, int high) {
        return recurse(node, low, high);
    }

    public int recurse(TreeNode node, int low, int high) {
        if (node == null) return 0;
        int rootValue = node.val <= high && node.val >= low ? node.val : 0;
        // int rootValue = 0;
        // if (node.val >= low && node.val <= high) {
        //     int rootValue += node.val;
        // }
//        System.out.println("rootValue is " + rootValue);
        int left = 0;
        int right = 0;
        if (node.left != null) {
            left = recurse(node.left, low, high);
        }
//        System.out.println("leftValue is " + left);

        if (node.right != null) {
            right = recurse(node.right, low, high);
//            System.out.println("rightValue is " + right);
        }

//        System.out.println("Final rootValue is " + rootValue + " left Value is "+ left + " right Value is " + right);
        return rootValue + left + right;
    }

    public static int rangeSumBSTII(TreeNode node, int low, int high) {
        if (node.val >= low && node.val <= high) {
            sum += node.val;
        }

        if (node.left != null) rangeSumBSTII(node.left, low, high);
        if (node.right != null) rangeSumBSTII(node.right, low, high);

        return sum;
    }

    public static int rangeSumBSTIII(TreeNode root, int low, int high) {
        List<Integer> list = new ArrayList<>();
        int total = 0;

        helper(root, low, high, list);

        for (Integer integer : list) {
            total += integer;
        }

        return total;
    }

    public static void helper(TreeNode root, int low, int high, List<Integer> list) {
        if (root == null) return;

        if (root.val <= high && root.val >= low) list.add(root.val);

        if (root.left != null) helper(root.left, low, high, list);
        if (root.right != null) helper(root.right, low, high, list);
    }

    public static void main(String[] args) {

    }
}
