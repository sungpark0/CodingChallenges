package com.codingChallenge.LinkedList;

public class SwapNodesInPairs extends SinglyLinkedList{

    public static SinglyNode swapPairs(SinglyNode head) {
        if(head == null || head.next == null) return head;

        SinglyNode nextNode = head.next;
        SinglyNode nextNextNode = nextNode.next;

        head.next = nextNextNode;
        nextNode.next = head;

        if(nextNextNode != null){
            head.next = swapPairs(nextNextNode);
        }

        return nextNode;
    }
    
    public static void main(String[] args) {
        
    }
}
