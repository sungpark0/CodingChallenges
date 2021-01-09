package com.codingChallenge.LinkedList;

public class ReverseLinkedListDoubly extends SinglyLinkedList {

    public static DoublyNode reverseList(DoublyNode node) {
        DoublyNode dummy = null;
        DoublyNode placeHolder = node;
        while (node != null) {
            placeHolder = placeHolder.next;
            node.next = dummy;
            dummy = node;
            node = placeHolder;
        }

        return dummy;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtTail(1);
    }

}
