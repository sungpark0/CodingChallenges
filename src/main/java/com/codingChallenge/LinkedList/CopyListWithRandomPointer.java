package com.codingChallenge.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer extends SinglyLinkedList {

    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Map<Node, Node> map = new HashMap<>();

        Node node = head;

        while (node != null) {
            Node temp = new Node(node.val);
            map.put(node, temp);
            node = node.next;
        }

        for (Map.Entry<Node, Node> entry : map.entrySet()) {
            Node temp = entry.getValue();
            temp.next = map.get(entry.getKey().next);
            temp.random = map.get(entry.getKey().random);
        }

        return map.get(head);
    }

    public static void main(String[] args) {

    }
}
