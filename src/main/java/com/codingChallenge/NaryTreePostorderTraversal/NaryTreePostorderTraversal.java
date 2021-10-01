package com.codingChallenge.NaryTreePostorderTraversal;

import java.util.*;

public class NaryTreePostorderTraversal {

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

    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) return list;

        dfs(root, list);

        return list;
    }

    public void dfs(Node root, List<Integer> list) {

        for (Node child : root.children) {
            dfs(child, list);
        }

        list.add(root.val);
    }


    public static void main(String[] args) {

    }
}
