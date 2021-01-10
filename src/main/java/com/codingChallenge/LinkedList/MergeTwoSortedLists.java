package com.codingChallenge.LinkedList;

import java.util.*;

public class MergeTwoSortedLists extends SinglyLinkedList {

    public static SinglyNode mergeTwoLists(SinglyNode l1, SinglyNode l2) {
        SinglyNode temp = new SinglyNode();
        SinglyNode result = temp;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1==null){
            temp.next = l2;
        } else {
            temp.next = l1;
        }

        return result.next;
    }

    public static void main(String[] args) {
////   l1
//        SinglyNode one = new SinglyNode(1);
//        SinglyNode two = new SinglyNode(2);
//        SinglyNode three = new SinglyNode(4);
//
////   l2
//        SinglyNode four = new SinglyNode(1);
//        SinglyNode five= new SinglyNode(3);
//        SinglyNode six = new SinglyNode(4);
//
//        one.next = two;
//        two.next = three;
//
//        four.next = five;
//        five.next = six;
//
//        SinglyNode com = mergeTwoLists(one, four);
//        while (com != null) {
//            System.out.println(com.val);
//           com= com.next;
//        }
        MergeTwoSortedLists l1 = new MergeTwoSortedLists();
        l1.insertAtTail(1);
        l1.insertAtTail(2);
        l1.insertAtTail(4);

        SinglyLinkedList l2 = new SinglyLinkedList();
        l2.insertAtTail(1);
        l2.insertAtTail(3);
        l2.insertAtTail(4);

        SinglyNode l1Node = l1.head;
        SinglyNode l2Node = l2.head;
        SinglyNode combined = mergeTwoLists(l1.head, l2.head);

        while (combined != null) {
            System.out.println(combined.val);
            combined = combined.next;
        }
    }

}
