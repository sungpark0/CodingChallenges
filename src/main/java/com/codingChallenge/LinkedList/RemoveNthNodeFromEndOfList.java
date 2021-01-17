package com.codingChallenge.LinkedList;

public class RemoveNthNodeFromEndOfList extends SinglyLinkedList {

    public static SinglyNode removeNthFromEnd(SinglyNode head, int n) {

        if (head.next == null) return null;

        SinglyNode currNode = head;
        int position = 0;

        while (currNode != null) {
            position++;
            currNode = currNode.next;
        }

        if (position == n) return head.next;

        position = (position - n) - 1;
        currNode = head;
        for (int i = 0; i < position; i++) {
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;

        return head;
    }

    public static void main(String[] args) {

    }
}
