package com.codingChallenge.LinkedList;

public class LinkedListCycleII extends SinglyLinkedList {

    public static SinglyNode detectCycleII(SinglyNode head) {

        if (head == null) return null;
        boolean checker = false;

        SinglyNode hare = head;
        SinglyNode tort = head;
        SinglyNode result = head;

        while (hare != null && hare.next != null && tort.next != null) {
            hare = hare.next.next;
            tort = tort.next;
            if (hare == tort) {
                checker = true;
                break;
            }
        }

        if (checker) {
            while (hare != result) {
                hare = hare.next;
                result = result.next;
            }
            return result;
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedListCycleII list = new LinkedListCycleII();

        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        SinglyNode temp = list.head;
        SinglyNode tem = list.head;
        SinglyNode circle = list.head.next;
        while (temp != null) {
            if (temp.next == null) {
                temp.next = circle;
                break;
            }
            temp = temp.next;
        }
        SinglyNode test = detectCycleII(tem);

    }
}
