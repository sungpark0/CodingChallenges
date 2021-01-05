package com.codingChallenge.DoublyLinkedList;

import com.codingChallenge.SinglyLinkedListTail.SinglyLinkedListTail;

public class DoublyLinkedList {

    int size;
    ListNode head;
    ListNode tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    class ListNode {
        int data;
        ListNode next;
        ListNode previous;

        public ListNode(int value) {
            data = value;
            next = null;
            previous = null;
        }

        public ListNode() {
        }
    }

    public int size() {
        return size;
    }

    public void insertAtHead(int value) {
        ListNode currentNode = new ListNode(value);
        if (head == null) {
            head = currentNode;
            tail = currentNode;
        } else {
            currentNode.next = head;
            currentNode.previous = currentNode;
            head = currentNode;
        }
        size++;
    }

    public void insertAtTail(int value) {
        ListNode currentNode = new ListNode(value);
        if (head == null) { //if its empty
            head = currentNode;
        } else {
            currentNode.previous = tail; // tail and previous go hand and hand together
            tail.next = currentNode;//
        }

        tail = currentNode;
        size++;

    }

    public void insertAtIndex(int index, int value) {
        ListNode newValue = new ListNode(value);
        ListNode temp = head;
        if (index < 0 || index > size) {
            System.out.println("Out of Bound");
        } else if (index == 0) {
            insertAtHead(value);
            size++;
        } else if (index == size - 1) {
            insertAtTail(value);
            size++;
        } else {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp=temp.next;
            newValue.previous = temp.previous;
            newValue.next = temp;
            temp.previous = newValue;
            newValue.previous.next = newValue;
        }
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) { //making sure the index is within the list range
            System.out.println("Out of Bound");
        } else if (index == 0) { //index at head
            head = head.next;
            head.previous = null;
            size--;
        } else if (index == size - 1) { //index at the tail. Extra if statement to take care tail.next = null
            tail = tail.previous;
            tail.next = null;
            size--;
        } else {
            ListNode itr = head;
            for (int i = 0; i < index; i++) {
                itr = itr.next;
            }
            itr.previous.next = itr.next; //if to not use .previous.next or next.previous we can make two temporary variables
            itr.next.previous = itr.previous;
            size--;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList test = new DoublyLinkedList();

//        test.insertAtHead(1);
//        test.insertAtHead(2);
//        test.insertAtHead(3);
        test.insertAtTail(1);
        test.insertAtTail(2);
        test.insertAtTail(3);
        test.insertAtIndex(1, 999);
        test.deleteAtIndex(1);

        ListNode current = test.head;
        for (int i = 0; i < test.size(); i++) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
