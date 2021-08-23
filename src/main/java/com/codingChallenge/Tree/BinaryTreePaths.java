package com.codingChallenge.Tree;

import java.util.*;

public class BinaryTreePaths extends BinarySearchTree {

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();

        dfs(root, paths, "");

        return paths;
    }

    public static void dfs(TreeNode root, List<String> list, String path) {
        if (root == null) return;

        path += root.val + "->";

        if (root.left == null && root.right == null) {
            list.add(path.substring(0, path.length() - 2));
            return;
        }

        dfs(root.left, list, path);
        dfs(root.right, list, path);
    }

    public static void main(String[] args) {

    }
}
