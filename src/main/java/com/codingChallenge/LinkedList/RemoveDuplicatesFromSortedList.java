package com.codingChallenge.LinkedList;

public class RemoveDuplicatesFromSortedList extends SinglyLinkedList {

    public static SinglyNode deleteDuplicates(SinglyNode head) {

        SinglyNode iterator = head;

        while (iterator != null) {
            if (iterator.next == null) break; //to prevent null pointer error
            if (iterator.val == iterator.next.val) {
                iterator.next = iterator.next.next;
            } else iterator = iterator.next;
        }

        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList();

        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(6);
//        list.insertAtTail(3);

//        SinglyNode curr = list.head;
//        System.out.println(list.head);
        SinglyNode curr = deleteDuplicates(list.head);

        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
