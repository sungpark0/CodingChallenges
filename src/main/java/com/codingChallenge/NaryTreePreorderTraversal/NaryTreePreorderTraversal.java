package com.codingChallenge.NaryTreePreorderTraversal;

import java.util.*;

public class NaryTreePreorderTraversal {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) return list;

        dfs(root, list);

        return list;
    }

    public static void dfs(Node node, List<Integer> list) {
        list.add(node.val);

        for (Node child : node.children) {
            dfs(child, list);
        }
    }

    public static void main(String[] args) {

    }
}
