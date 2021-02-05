package com.codingChallenge.LinkedList;

public class MiddleOfTheLinkedList extends SinglyLinkedList {

    public static SinglyNode middleNode(SinglyNode head) {
        SinglyNode temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int middle = size / 2;

        for (int i = 0; i < middle; i++) {
            head = head.next;
        }

        return head;
    }

    public static void main(String[] args) {

    }
}
