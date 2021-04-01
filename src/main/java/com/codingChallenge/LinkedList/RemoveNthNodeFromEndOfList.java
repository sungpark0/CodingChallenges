package com.codingChallenge.LinkedList;

import java.util.ArrayList;
import java.util.List;

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
        if(currNode == head){
            head = currNode.next;
        } else {
            currNode.next = currNode.next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);

//        while(test !=null){
//            System.out.println(test.val);
//            test = test.next;
//        }

        System.out.println(removeNthFromEnd(list.head, 1));

        List<Integer> temp = new ArrayList<>();

        SinglyNode test = list.head;

        while (test != null) {
            temp.add(test.val);
            test = test.next;
        }

        System.out.println(temp);
    }
}
