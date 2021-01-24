package com.codingChallenge.Tree;

import java.util.*;

public class BinaryTreeInOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root == null) return result;
        inOrder(root, result);

        return result;
    }

    public void inOrder(TreeNode node, List<Integer> list){
        if(node.left != null) inOrder(node.left, list);
        list.add(node.val);
        if(node.right!=null) inOrder(node.right, list);
    }
}
