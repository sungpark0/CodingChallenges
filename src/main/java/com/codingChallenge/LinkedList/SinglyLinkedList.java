package com.codingChallenge.LinkedList;
 
public class SinglyLinkedList implements LinkedListInterface {

    int size;
    public SinglyNode head;

    public int size() {
        return size;
    }

    public SinglyLinkedList() {
        this.size = 0;
        this.head = null;
    }

    @Override    
    public void insertAtHead(int value) {
        SinglyNode newValue = new SinglyNode(value);
        newValue.next = head;
        head = newValue;
        size++;
    }
    
    @Override
    public void insertAtTail(int value) {
        SinglyNode newValue = new SinglyNode(value);
        if (head == null) {
            head = newValue;
        }
        SinglyNode temp = head;
        for (int i = 0; i < size - 1; i++) {
            temp = temp.next;
        }

        temp.next = newValue;
        size++;
    }
    
    public void insertAfter(int value, int index) {
        SinglyNode newValue = new SinglyNode(value);
        SinglyNode temp = head;
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
//        if (head.val == value) {
//            deleteAtHead();
//            size--;
//            return;
//        }

        SinglyNode temp = head;
        SinglyNode dummyNode = new SinglyNode();
        while (temp != null) {
            if (temp.val == value) {
                dummyNode.next = temp.next;
            }
            dummyNode = temp;
            temp = temp.next;
        }
        size--;
    }

    public void searchNode(int value) {
        boolean check = false;
        SinglyNode temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.val == value) {
                check = true;
                break;
            }
            temp = temp.next;
        }
        System.out.println(check);
    }

    public static void main(String[] args) {
        SinglyLinkedList test = new SinglyLinkedList();

//        test.insertAtTail(1);
//        test.insertAtTail(2);
//        test.insertAtTail(3);
//        test.insertAtTail(4);
//        test.insertAtTail(5);
        test.insertAtHead(1);
        test.insertAtHead(2);
        test.insertAtHead(3);
        test.insertAtHead(4);
        test.insertAtHead(3);
        test.insertAtHead(5);
        test.insertAtTail(3);
        test.insertAtHead(3);
//        test.insertAfter(90, 1);
//        test.deleteAtHead();
        test.deleteByValue(3);
//        test.searchNode(3);
        SinglyNode current = test.head;

        while(current!=null){
            System.out.println(current.val);
            current=current.next;
        }
    }

}
