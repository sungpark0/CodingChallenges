package com.codingChallenge.SinglyLinkedList;

public class SinglyLinkedList {

    private Node head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    private static class Node {
        public int data;
        public Node next;

        public Node(int value) {
            data = value;
            next = null;
        }
    }

    public int size() {
        return size;
    }

    public void insertAtHead(int data) {
        Node currentNode = new Node(data);

        if (head != null) {
            currentNode.next = head;
        }
        head = currentNode;
        size++;
    }


    public static void main(String[] args) {
        SinglyLinkedList test = new SinglyLinkedList();

        test.insertAtHead(5);
        test.insertAtHead(6);
        test.insertAtHead(3);

        Node current = test.head;
        for (int i = 0; i < test.size(); i++) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}
