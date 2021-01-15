package com.codingChallenge.LinkedList;

public class OddEvenLinkedList extends SinglyLinkedList{

    public static SinglyNode oddEvenList(SinglyNode head){
        if(head ==null) return null;

        SinglyNode oddNodes = head;
        SinglyNode evenNodes = head.next;

        SinglyNode evenPointer = evenNodes;

        while(oddNodes.next!=null && evenNodes.next !=null){
            oddNodes.next =evenNodes.next;
            oddNodes=oddNodes.next;

            evenNodes.next = oddNodes.next;
            evenNodes=evenNodes.next;
        }
        oddNodes.next=evenPointer;

        return head;

    }

    public static void main(String[] args) {

    }
}
