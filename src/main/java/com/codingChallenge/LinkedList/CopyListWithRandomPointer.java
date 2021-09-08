package com.codingChallenge.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer extends SinglyLinkedList {

    public static SinglyNode copyRandomList(SinglyNode head) {
        if (head == null) return null;

        Map<SinglyNode, SinglyNode> map = new HashMap<>();

        SinglyNode SinglyNode = head;

        while (SinglyNode != null) {
            SinglyNode temp = new SinglyNode(SinglyNode.val);
            map.put(SinglyNode, temp);
            SinglyNode = SinglyNode.next;
        }

        for (Map.Entry<SinglyNode, SinglyNode> entry : map.entrySet()) {
            SinglyNode temp = entry.getValue();
            temp.next = map.get(entry.getKey().next);
            temp.random = map.get(entry.getKey().random);
        }

        return map.get(head);
    }

    public static void main(String[] args) {

    }
}
