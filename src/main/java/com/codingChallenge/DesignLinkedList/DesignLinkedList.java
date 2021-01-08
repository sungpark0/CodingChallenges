package com.codingChallenge.DesignLinkedList;

public class DesignLinkedList {

    int size;
    ListNode head;
    ListNode tail;

    public DesignLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public void addAtHead(int val) {
        ListNode newValue = new ListNode(val);
        if (size == 0) {
            head = newValue;
            tail = newValue;
        } else {
            newValue.next = head;
            head.prev = newValue;
            head = newValue;
        }
        size++;
    }

    public void addAtTail(int val) {
        ListNode newValue = new ListNode(val);
        if (size == 0) { //if linked list is empty then we point head and tail to the newValue
            head = newValue;
        } else {
            newValue.prev = tail;
            tail.next = newValue;
        }
        tail = newValue;
        size++; //increment since we added
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else if (index > 0 && index < size) {
            ListNode temp = head;
            ListNode newValue = new ListNode(val);
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            newValue.prev = temp.prev;
            newValue.next = temp;
            temp.prev = newValue;
            newValue.prev.next = newValue;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            head = head.next;
            size--;
        } else if (index == size - 1) {
            tail = tail.prev;
            size--;
        } else if (index >= 0 && index < size) {
            ListNode temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            size--;
        }
    }

    static class ListNode {
        ListNode next;
        ListNode prev;
        int value;

        private ListNode(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public static void main(String[] args) {

        DesignLinkedList test = new DesignLinkedList();

        test.addAtHead(1);
        test.addAtHead(2);
        test.addAtHead(3);
//        test.addAtTail(1);
//        test.addAtTail(2);
//        test.addAtTail(3);
        test.deleteAtIndex(2);
//        System.out.println(test.get(1));

        ListNode temp = test.head;
        for (int i = 0; i < test.size; i++) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }
}
