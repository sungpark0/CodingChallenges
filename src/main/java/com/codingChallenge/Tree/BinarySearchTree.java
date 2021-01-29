package com.codingChallenge.Tree;

import com.sun.source.tree.Tree;

public class BinarySearchTree extends TreeNode {

    public TreeNode root;

    /**
     * Insert using recursion
     */
    public void insertRecursion(int val) { // for the root
        root = insertRecursion(root, val);
    }

    public TreeNode insertRecursion(TreeNode node, int val) {
        if (node == null) return new TreeNode(val);

        if (val < node.val) {
            node.left = insertRecursion(node.left, val);
        } else if (val > node.val) {
            node.right = insertRecursion(node.right, val);
        }

        return node;
    }

    public void insertRecursionII(int val) {
        root = insertRecursionII(root, val);
    }

    public TreeNode insertRecursionII(TreeNode node, int val) {
        if (node == null) return new TreeNode(val);

        if (val < node.val) {
            node.left = insertRecursionII(node.left, val);
        } else if (val > node.val) {
            node.right = insertRecursionII(node.right, val);
        }
        return node;
    }

    public void insertRecursionIII(int val) {
        root = insertRecursionIII(root, val);
    }

    public TreeNode insertRecursionIII(TreeNode node, int val) {
        if (node == null) return new TreeNode(val);

        if (val < node.val) {
            node.left = insertRecursionIII(node.left, val);
        } else if (val > node.val) {
            node.right = insertRecursionIII(node.right, val);
        }

        return node;
    }

    /**
     * Insert using iteration
     */
    public void insertIteration(int val) {
        if (root == null) {
            root = new TreeNode(val);
            return;
        }

        TreeNode currNode = root;
        while (true) {
            if (val < currNode.val) { //val is smaller so moving to the left
                if (currNode.left == null) {
                    currNode.left = new TreeNode(val);
                    break;
                } else {
                    currNode = currNode.left;
                }
            } else if (val > currNode.val) { //val is bigger so moving to the right
                if (currNode.right == null) {
                    currNode.right = new TreeNode(val);
                    break;
                } else {
                    currNode = currNode.right;
                }
            }
        }
    }

    public void preOrderPrint(TreeNode node) {
        if (node == null) return;

        System.out.println(node.val);
        preOrderPrint(node.left);
        preOrderPrint(node.right);
    }

    public void InOrderPrint(TreeNode node) {
        if (node == null) return;

        InOrderPrint(node.left);
        System.out.println(node.val);
        InOrderPrint(node.right);
    }

    public void postOrderPrint(TreeNode node) {
        if (node == null) return;

        postOrderPrint(node.left);
        postOrderPrint(node.right);
        System.out.println(node.val);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        BinarySearchTree treeTwo = new BinarySearchTree();

        tree.insertIteration(4);
        tree.insertIteration(2);
        tree.insertIteration(3);
        tree.insertIteration(6);
        tree.insertIteration(5);
        tree.insertIteration(8);

        tree.preOrderPrint(tree.root);

        treeTwo.insertRecursionIII(4);
        treeTwo.insertRecursionIII(2);
        treeTwo.insertRecursionIII(3);
        treeTwo.insertRecursionIII(6);
        treeTwo.insertRecursionIII(5);
        treeTwo.insertRecursionIII(8);

        treeTwo.preOrderPrint(treeTwo.root);
    }

}
