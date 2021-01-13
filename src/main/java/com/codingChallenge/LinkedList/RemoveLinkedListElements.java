package com.codingChallenge.LinkedList;

public class RemoveLinkedListElements extends SinglyLinkedList {

    public static SinglyNode removeElements(SinglyNode head, int value) {
        if (head == null) return null;

        SinglyNode currNode = head;

        SinglyNode dummyNode = new SinglyNode();
        SinglyNode prevNode = dummyNode;
        prevNode.next = head;

        while (currNode != null) {
            if (currNode.val == value) {
                prevNode.next = currNode.next;
            } else {
                prevNode = prevNode.next;
            }
            currNode = currNode.next;
        }
        return dummyNode.next;
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
