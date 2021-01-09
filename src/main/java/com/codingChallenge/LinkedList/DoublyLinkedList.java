package com.codingChallenge.LinkedList;

public class DoublyLinkedList implements LinkedListInterface {

    int size;
    DoublyNode head;
    DoublyNode tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    @Override
    public void insertAtHead(int value) {
        DoublyNode currentNode = new DoublyNode(value);
        if (head == null) {
            head = currentNode;
            tail = currentNode;
        } else {
            currentNode.next = head;
            currentNode.prev = currentNode;
            head = currentNode;
        }
        size++;
    }

    @Override
    public void insertAtTail(int value) {
        DoublyNode currentNode = new DoublyNode(value);
        if (head == null) { //if its empty
            head = currentNode;
        } else {
            currentNode.prev = tail; // tail and previous go hand and hand together
            tail.next = currentNode;//
        }

        tail = currentNode;
        size++;

    }

    public void insertAtIndex(int index, int value) {
        DoublyNode newValue = new DoublyNode(value);
        DoublyNode temp = head;
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
            newValue.prev = temp.prev;
            newValue.next = temp;
            temp.prev = newValue;
            newValue.prev.next = newValue;
        }
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) { //making sure the index is within the list range
            System.out.println("Out of Bound");
        } else if (index == 0) { //index at head
            head = head.next;
            head.prev = null;
            size--;
        } else if (index == size - 1) { //index at the tail. Extra if statement to take care tail.next = null
            tail = tail.prev;
            tail.next = null;
            size--;
        } else {
            DoublyNode itr = head;
            for (int i = 0; i < index; i++) {
                itr = itr.next;
            }
            itr.prev.next = itr.next; //if to not use .prev.next or next.prev we can make two temporary variables
            itr.next.prev = itr.prev;
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

        DoublyNode current = test.head;
        for (int i = 0; i < test.size(); i++) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
