package com.codingChallenge.SinglyLinkedListTail;

public class SinglyLinkedListTail {

    int size;
    ListNode head;

    public SinglyLinkedListTail() {
        head = null;
        size = 0;
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int value) {
            val = value;
            next = null;
        }
        public ListNode(){
        }
    }

    public int size() {
        return size;
    }

    public void insertAtHead(int value) {
        ListNode currentNode = new ListNode(value);

        if (head != null) {
            currentNode.next = head;
        }
        head = currentNode;
        size++;
    }
    public void deleteAtHead(){
        ListNode temp = head.next;
        if(temp ==null){
            head=null;
            return;
        }
        head = temp;
        size--;

    }

    public void insertAtEnd(int value) {
        ListNode node = new ListNode();
        node.val = value;
        ListNode currentNode = head;
        if(currentNode.next !=null){
            currentNode = currentNode.next;
        }
        currentNode.next = node;
        size++;
    }

    public void insertAfter(int value, int previous){
        ListNode temp = head;

        while(temp!= null){
            int nodeVal = temp.val;
            if(nodeVal==previous){
                ListNode newNode = new ListNode();
                newNode.val = value;
                newNode.next = temp.next;

                temp.next=newNode;
            }
            temp = temp.next;
        }
        size++;
    }

    public void deleteByValue(int value){
        if(size ==0){
            return;
        }

        if(head.val == value){
            deleteAtHead();
            size--;
            return;
        }

        ListNode currentNode =head;
        ListNode dummyNode = null;
        while(currentNode!= null){
            if(currentNode.val==value){
                if (dummyNode != null) {
                    dummyNode.next = currentNode.next;
                }
            }
            dummyNode=currentNode;
            currentNode=currentNode.next;
        }
        size--;
    }

    public void searchNode(int value){
        boolean exist = false;
        ListNode node = head;
        while(node != null){
            if (node.val == value) {
                exist = true;
                break;
            }
            node = node.next;
        }
        System.out.println(exist);
    }

    public static void main(String[] args) {
        SinglyLinkedListTail test = new SinglyLinkedListTail();

        test.insertAtHead(1);
        test.insertAtHead(2);
        test.insertAtHead(3);
        test.insertAtHead(4);
        test.insertAtHead(5);
        test.insertAfter(9,2);
        test.deleteAtHead();
        test.deleteByValue(2);
        test.searchNode(10);




        int i = 0 ;
        ListNode current = test.head;
        while (i < test.size) {

            System.out.println(current.val);

            i++;
            current = current.next;
        }
    }

}
