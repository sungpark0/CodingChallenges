package com.codingChallenge.Tree;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

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


    public static void printLevelsIteratively(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            queue.stream().forEach(v -> System.out.println(v.val));

            TreeNode node = queue.peek();
            if (node != null) {
                System.out.println(node.val + " hi");
                queue.remove();


                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            }
            System.out.println("===================");
        }

    }

//                4
//        2             6
//             3     5          8
//
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        BinarySearchTree treeTwo = new BinarySearchTree();

//        tree.insertIteration(2);
//        tree.insertIteration(2);
//        tree.insertIteration(3);
//        tree.insertIteration(6);
//        tree.insertIteration(5);
//        tree.insertIteration(8);
//
//        printLevelsIteratively(tree.root);

        tree.preOrderPrint(tree.root);

        treeTwo.insertRecursionIII(12);
        treeTwo.insertRecursionIII(9);
        treeTwo.insertRecursionIII(5);
        treeTwo.insertRecursionIII(3);
        treeTwo.insertRecursionIII(10);
        treeTwo.insertRecursionIII(11);
        treeTwo.insertRecursionIII(14);
        treeTwo.insertRecursionIII(17);
        treeTwo.insertRecursionIII(16);
        treeTwo.insertRecursionIII(19);
        //     12
        //   9     14
        // 5  10      17
        //3     11   16  19

//        treeTwo.preOrderPrint(treeTwo.root);
//        treeTwo.postOrderPrint(treeTwo.root);
        treeTwo.InOrderPrint(treeTwo.root);
    }

}
