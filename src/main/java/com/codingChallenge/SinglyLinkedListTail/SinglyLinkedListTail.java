package com.codingChallenge.SinglyLinkedListTail;

import java.util.List;

public class SinglyLinkedListTail {

    int size;
    ListNode head;

    public int size() {
        return size;
    }

    public SinglyLinkedListTail() {
        this.size = 0;
        this.head = null;
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

    public void insertAfter(int value, int index) {
        ListNode newValue = new ListNode(value);
        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        newValue.next = temp.next;
        temp.next = newValue;
        size++;
    }

    public void deleteAtHead() {
        head = head.next;
        size--;
    }

    public void deleteByValue(int value) {
        if (size == 0) return;
        if (head.data == value) {
            deleteAtHead();
            size--;
            return;
        }

        ListNode temp = head;
        ListNode dummyNode = new ListNode();
        while (temp != null) {
            if (temp.data == value) {
                dummyNode.next = temp.next;
            }
            dummyNode = temp;
            temp = temp.next;
        }
        size--;
    }

    public void searchNode(int value) {
        boolean check = false;
        ListNode temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == value) {
                check = true;
                break;
            }
            temp = temp.next;
        }
        System.out.println(check);
    }

    public static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

        public ListNode() {
        }
    }

    public static void main(String[] args) {
        SinglyLinkedListTail test = new SinglyLinkedListTail();

        test.insertAtEnd(1);
        test.insertAtEnd(2);
        test.insertAtEnd(3);
        test.insertAtEnd(4);
        test.insertAtEnd(5);
//        test.insertAtHead(1);
//        test.insertAtHead(2);
//        test.insertAtHead(3);
//        test.insertAtHead(4);
//        test.insertAtHead(5);
//        test.insertAfter(90, 1);
//        test.deleteAtHead();
//        test.deleteByValue(4);
//        test.searchNode(3);
        ListNode current = test.head;

        for (int i = 0; i < test.size; i++) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}
