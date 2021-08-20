package com.codingChallenge.PopulatingNextRightPointersInEachNode;

import com.codingChallenge.Tree.BinarySearchTree;

class PopulatingNextRightPointersInEachNode extends BinarySearchTree {

    public int val;
    public PopulatingNextRightPointersInEachNode left;
    public PopulatingNextRightPointersInEachNode right;
    public PopulatingNextRightPointersInEachNode next;

    public PopulatingNextRightPointersInEachNode() {
    }

    public PopulatingNextRightPointersInEachNode(int _val) {
        val = _val;
    }

    public PopulatingNextRightPointersInEachNode(
            int _val,
            PopulatingNextRightPointersInEachNode _left,
            PopulatingNextRightPointersInEachNode _right,
            PopulatingNextRightPointersInEachNode _next
    ) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }

    public static PopulatingNextRightPointersInEachNode connect(PopulatingNextRightPointersInEachNode root) {
        if (root == null) return root;

        dfs(root);

        return root;
    }

    public static void dfs(PopulatingNextRightPointersInEachNode root) {
        if (root == null) return;

        if (root.left != null) root.left.next = root.right;
        if (root.right != null && root.next != null) root.right.next = root.next.left;

        dfs(root.left);
        dfs(root.right);
    }

    public static void main(String[] args) {

    }
}
