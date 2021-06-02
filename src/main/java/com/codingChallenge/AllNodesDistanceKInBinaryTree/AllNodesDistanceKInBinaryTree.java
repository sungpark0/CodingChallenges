package com.codingChallenge.AllNodesDistanceKInBinaryTree;

import com.codingChallenge.Tree.BinarySearchTree;
import com.codingChallenge.Tree.TreeNode;

import java.util.*;

public class AllNodesDistanceKInBinaryTree extends BinarySearchTree {

    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(k == 0) return List.of(target.val);
        List<Integer> result = new ArrayList<>();

        //Mapping the parent nodes
        //Filling in the map with <CurrentNode, ParentNode>
        Map<TreeNode, TreeNode> parentsMap = new HashMap<>();
        dfsParentNodes(parentsMap, root, null);

        //Keep track of where we visited while looping through the tree
        Set<TreeNode> visited = new HashSet<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(target);

        while (!queue.isEmpty()) {
            //Fixed size
            int size = queue.size();
            //Looping
            while (size > 0) {
                size--;
                TreeNode node = queue.remove();

                if (!visited.add(node)) continue;
                //
                if (k == 0) result.add(node.val);

                else {
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                    if (parentsMap.get(node) != null) queue.add(parentsMap.get(node));
                }
            }

            k--;
        }

        return result;
    }

    public static List<Integer> distanceKII(TreeNode root, TreeNode target, int k) {
        if(k == 0) return List.of(target.val);
        List<Integer> result = new ArrayList<>();
        Map<TreeNode, TreeNode> parentsMap = new HashMap<>();
        dfsParentNodes(parentsMap, root, null);

        Set<TreeNode> visited = new HashSet<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(target);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                size--;
                TreeNode node = queue.remove();

                if (!visited.add(node)) continue;
                if (k == 0) result.add(node.val);

                else {
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                    if (parentsMap.get(node) != null) queue.add(parentsMap.get(node));
                }
            }

            k--;
        }

        return result;
    }

    public static void dfsParentNodes(Map<TreeNode, TreeNode> map, TreeNode node, TreeNode parent) {
        if (node == null) return;

        map.put(node, parent);
        dfsParentNodes(map, node.left, node);
        dfsParentNodes(map, node.right, node);
    }

    public static void main(String[] args) {

    }
}
