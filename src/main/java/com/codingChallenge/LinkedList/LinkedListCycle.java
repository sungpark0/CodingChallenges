package com.codingChallenge.LinkedList;

import java.util.HashMap;

public class LinkedListCycle extends SinglyLinkedList {

    public static boolean hasCycle(SinglyNode head) {

        HashMap<SinglyNode, Integer> map = new HashMap<>();

        while (head != null) {
            if (map.containsKey(head)) {
                return true;
            } else {
                map.put(head, head.val);
            }
            head = head.next;
        }

        return false;
    }

    public static boolean hasCycleII(SinglyNode head) {
        if (head == null) return false;

        SinglyNode hare = head;
        SinglyNode tort = head;

        while (hare != null && tort != null) {
            hare = hare.next.next;
            tort = tort.next;
            if (hare == tort) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {

    }
}
