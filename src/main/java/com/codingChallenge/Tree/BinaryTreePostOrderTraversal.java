package com.codingChallenge.Tree;

import java.util.*;

public class BinaryTreePostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root == null) return result;
        postOrder(root, result);

        return result;
    }

    public void postOrder(TreeNode node, List<Integer> list){
        if(node.left !=null ) postOrder(node.left, list);
        if(node.right !=null) postOrder(node.right, list);
        list.add(node.val);
    }
}
