package com.codingChallenge.SubtreeOfAnotherTree;

import com.codingChallenge.Tree.TreeNode;

public class SubtreeOfAnotherTree {

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) return true;
        if(root == null) return false;

        if(isMatch(root, subRoot)) return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean isMatch(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;

        return root.val == subRoot.val && (isMatch(root.left, subRoot.left)) && (isMatch(root.right, subRoot.right));
    }

    public static void main(String[] args) {


    }
}
