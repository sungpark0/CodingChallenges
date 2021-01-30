package com.codingChallenge.Tree;

public class RangeSumOfBST {

    // int sum = 0;
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
        if (node.left != null){
            left = recurse(node.left, low, high);
        }
//        System.out.println("leftValue is " + left);

        if (node.right != null){
            right = recurse(node.right, low, high);
//            System.out.println("rightValue is " + right);
        }

//        System.out.println("Final rootValue is " + rootValue + " left Value is "+ left + " right Value is " + right);
        return rootValue + left + right;
    }
}
