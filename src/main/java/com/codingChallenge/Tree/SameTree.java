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

    public static boolean isSameTreeBFS(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        Queue<TreeNode> pQueue = new LinkedList<>();
        Queue<TreeNode> qQueue = new LinkedList<>();

        pQueue.add(p);
        qQueue.add(q);

        while (!pQueue.isEmpty() && !qQueue.isEmpty()) {
            TreeNode pTemp = pQueue.remove();
            TreeNode qTemp = qQueue.remove();

            if (pTemp.val != qTemp.val) return false;

            if (pTemp.left != null && qTemp.left != null) {
                pQueue.add(pTemp.left);
                qQueue.add(qTemp.left);
            } else if (pTemp.left != null || qTemp.left != null) return false;

            if (pTemp.right != null && qTemp.right != null) {
                pQueue.add(pTemp.right);
                qQueue.add(qTemp.right);
            } else if (pTemp.right != null || qTemp.right != null) return false;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
