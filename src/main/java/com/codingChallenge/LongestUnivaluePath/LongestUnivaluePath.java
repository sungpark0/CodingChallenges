package com.codingChallenge.LongestUnivaluePath;

import com.codingChallenge.Tree.BinarySearchTree;
import com.codingChallenge.Tree.TreeNode;

public class LongestUnivaluePath extends BinarySearchTree {

    static int longest = 0;

    public static int longestUnivaluePath(TreeNode root) {
        if (root == null) return 0;

        helper(root, root.val);

        return longest - 1;
    }

    public static int helper(TreeNode root, int currVal) {
        if (root == null) return 0;

        int left = helper(root.left, root.val);
        int right = helper(root.right, root.val);
        longest = Math.max(longest, left + right + 1);

        if (root.val == currVal) return Math.max(left, right) + 1;
        else return 0;
    }
    
    public static void main(String[] args) {
        
    }
}
