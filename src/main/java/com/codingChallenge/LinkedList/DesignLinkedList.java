package com.codingChallenge.LinkedList;

public class DesignLinkedList implements LinkedListInterface{

    int size;
    DoublyNode head;
    DoublyNode tail;

    public DesignLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        DoublyNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    @Override
    public void insertAtHead(int val) {
        DoublyNode newValue = new DoublyNode(val);
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

    @Override
    public void insertAtTail(int val) {
        DoublyNode newValue = new DoublyNode(val);
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
            insertAtHead(val);
        } else if (index == size) {
            insertAtTail(val);
        } else if (index > 0 && index < size) {
            DoublyNode temp = head;
            DoublyNode newValue = new DoublyNode(val);
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
            DoublyNode temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next.prev = temp.prev;
            temp.prev.next = temp.next;
            size--;
        }
    }

    public static void main(String[] args) {

        DesignLinkedList test = new DesignLinkedList();

        test.insertAtHead(1);
        test.insertAtHead(2);
        test.insertAtHead(3);
//        test.insertAtTail(1);
//        test.insertAtTail(2);
//        test.insertAtTail(3);
        test.deleteAtIndex(2);
//        System.out.println(test.get(1));

        DoublyNode temp = test.head;
        for (int i = 0; i < test.size; i++) {
            System.out.println(temp.value);
            temp = temp.next;
        }

    }
}
