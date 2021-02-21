package com.codingChallenge.Tree;

import java.util.*;

public class SameTree extends BinarySearchTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> pList = new ArrayList<>();
        List<Integer> qList = new ArrayList<>();

        preOrderList(pList, p);
        preOrderList(qList, q);

        return pList.equals(qList);
    }

    public static void preOrderList(List<Integer> list, TreeNode node) {
        if (node == null) {
            list.add(null);
            return;
        }

        list.add(node.val);
        preOrderList(list, node.left);
        preOrderList(list, node.right);
    }

    public static void main(String[] args) {

    }
}
