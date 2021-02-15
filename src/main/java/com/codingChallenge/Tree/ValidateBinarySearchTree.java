package com.codingChallenge.Tree;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree extends BinarySearchTree {

    public boolean isValidBST(TreeNode root) {

        if (root == null) return true;

        List<Integer> result = new ArrayList<>();

        InOrderList(root, result);

        for (int i = 0; i < result.size() - 1; i++) {
            if (result.get(i) >= result.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public void InOrderList(TreeNode node, List<Integer> list) {

        if (node.left != null) InOrderList(node.left, list);
        list.add(node.val);
        if (node.right != null) InOrderList(node.right, list);
    }

    public boolean isValidBSTII(TreeNode root) {
        return subValidBSTII(root, null, null);
    }

    public boolean subValidBSTII(TreeNode node, TreeNode leftNode, TreeNode rightNode) {
        if (node == null) return true;

        if (leftNode != null && leftNode.val >= node.val) return false;
        if (rightNode != null && rightNode.val <= node.val) return false;

        return subValidBSTII(node.left, leftNode, node) && subValidBSTII(node.right, node, rightNode);
    }


    public static void main(String[] args) {

    }
}
