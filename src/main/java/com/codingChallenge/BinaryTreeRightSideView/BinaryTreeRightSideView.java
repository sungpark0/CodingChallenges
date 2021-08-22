package com.codingChallenge.BinaryTreeRightSideView;

import com.codingChallenge.Tree.BinarySearchTree;
import com.codingChallenge.Tree.TreeNode;

import java.util.*;

public class BinaryTreeRightSideView extends BinarySearchTree {

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSides = new ArrayList<>();

        if (root == null) return rightSides;

        dfs(root, rightSides, 0);

        return rightSides;
    }

    public static void dfs(TreeNode root, List<Integer> list, int maxSize) {
        if (root == null) return;

        if (list.size() == maxSize) list.add(root.val);

        dfs(root.right, list, maxSize + 1);
        dfs(root.left, list, maxSize + 1);
    }

    public static void main(String[] args) {

    }
}
