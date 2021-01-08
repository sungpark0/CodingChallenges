package com.codingChallenge.ReverseLinkedList;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {

    int size;
    ListNode head;

    public ReverseLinkedList() {
        this.size = 0;
        this.head = null;
    }

    static class ListNode{
        int data;
        ListNode next;

        public ListNode(int value) {
            this.data = value;
            this.next = null;
        }

    }

    public void insertAtHead(int value) {
        ListNode newValue = new ListNode(value);
        newValue.next = head;
        head = newValue;
        size++;
    }

    public void insertAtEnd(int value) {
        ListNode newValue = new ListNode(value);
        if (head == null) {
            head = newValue;
        }
        ListNode temp = head;
        for (int i = 0; i < size - 1; i++) {
            temp = temp.next;
        }

        temp.next = newValue;
        size++;
    }

    public static ListNode reverseList(ListNode node){
        ListNode dummy = null;
        ListNode placeHolder = node;
        while(node!=null){
            placeHolder=placeHolder.next;
            node.next = dummy;
            dummy=node;
            node=placeHolder;
        }

        return dummy;
    }

//    public static List<Integer> makeList(ReverseLinkedList linkedList) {
//        List<Integer> list = new ArrayList<>();
//
//        ListNode temp = linkedList.head;
//        while (temp != null) {
//            list.add(temp.data);
//            temp = temp.next;
//        }
//
//        return list;
//    }
//    public static ReverseLinkedList listNodeOf(int a, int b, int c, int d, int e){
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
    public static ReverseLinkedList listNodeOfI(int ...numbers){
        ReverseLinkedList list = new ReverseLinkedList();

        for (int number : numbers) {
            list.insertAtEnd(number);
        }

        return list;
    }

    public static void main(String[] args) {

        ReverseLinkedList list = listNodeOfI(1, 2, 3, 4, 5);


        System.out.println(listNodeOfI(1, 2, 3).size);
    }
}
