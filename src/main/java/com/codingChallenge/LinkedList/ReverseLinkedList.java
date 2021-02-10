package com.codingChallenge.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList extends SinglyLinkedList {

    public int size;
    public SinglyNode head;

    public ReverseLinkedList() {
        this.size = 0;
        this.head = null;
    }

    //Recursion
    public static SinglyNode reverseListRecursion(SinglyNode head) {
        if (head == null) return head;

        SinglyNode next = head.next;
        head.next = null;

        return reverseRecursion(head, next);
    }

    public static SinglyNode reverseRecursion(SinglyNode currNode, SinglyNode nextNode) {
        if (nextNode == null) return currNode;

        SinglyNode temp = nextNode.next;
        nextNode.next = currNode;

        return reverseRecursion(nextNode, temp);
    }

    //Iteration
    public static SinglyNode reverseList(SinglyNode node) {
        SinglyNode dummy = null;
        SinglyNode placeHolder = node;
        while (node != null) {
            placeHolder = placeHolder.next;
            node.next = dummy;
            dummy = node;
            node = placeHolder;
        }

        return dummy;
    }

    public static List<Integer> makeList(ReverseLinkedList linkedList) {
        List<Integer> list = new ArrayList<>();

        SinglyNode temp = linkedList.head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        return list;
    }

    //    public static ReverseLinkedList SinglyNodeOf(int a, int b, int c, int d, int e){
//        ReverseLinkedList list = new ReverseLinkedList();
//
//        list.insertAtEnd(a);
//        list.insertAtEnd(b);
//        list.insertAtEnd(c);
//        list.insertAtEnd(d);
//        list.insertAtEnd(e);
//
//        return list;
//    }
    public static ReverseLinkedList SinglyNodeOfI(int... numbers) {
        ReverseLinkedList list = new ReverseLinkedList();

        for (int number : numbers) {
            list.insertAtTail(number);
        }

        return list;
    }

//    public static void main(String[] args) {
//
//        ReverseLinkedList list = SinglyNodeOfI(1, 2, 3, 4, 5);
//
//
//        System.out.println(SinglyNodeOfI(1, 2, 3).size);
//    }
}
