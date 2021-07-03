package com.codingChallenge.LinkedList;

public class RemoveLinkedListElements extends SinglyLinkedList {

    public static SinglyNode removeElements(SinglyNode head, int val) {
        if (head == null) return null;

        SinglyNode node = head;

        while (head.next != null) {
            if (head.next.val == val) head.next = head.next.next;
            else head = head.next;
        }

        return node.val == val ? node.next : node;
    }

    public static void main(String[] args) {

        RemoveLinkedListElements list = new RemoveLinkedListElements();
        list.insertAtHead(1);
        list.insertAtHead(1);
        list.insertAtHead(1);
        SinglyNode cur = list.head;
        SinglyNode test = removeElements(cur, 1);

        while (test != null) {
            System.out.println(test.val);
            test = test.next;
        }
    }
}
