package com.codingChallenge.ReverseLinkedList;

import com.codingChallenge.LinkedList.SinglyNode;
import com.codingChallenge.LinkedList.ReverseLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedSinglyTest extends SinglyNode {

    ReverseLinkedList rLinkedList = new ReverseLinkedList();

    @Test
    void positiveTest() {
        rLinkedList.insertAtHead(1);
        rLinkedList.insertAtTail(2);
        rLinkedList.insertAtTail(3);
        rLinkedList.insertAtTail(4);
        rLinkedList.insertAtTail(5);
        SinglyNode linkedList = rLinkedList.head;
        SinglyNode test = ReverseLinkedList.reverseList(linkedList);

        assertEquals("5,4,3,2,1", createStringRepresentation(test));
    }

    @Test
    void negativeTest() {
        rLinkedList.insertAtHead(1);
        rLinkedList.insertAtTail(2);
        rLinkedList.insertAtTail(3);
        rLinkedList.insertAtTail(4);
        rLinkedList.insertAtTail(5);
        SinglyNode linkedList = rLinkedList.head;
        /**
         * only difference between positiveTest and negativeTest is utilizing reverseList method.
         */
        assertNotEquals("5,4,3,2,1", createStringRepresentation(linkedList));
    }


    public String createStringRepresentation(SinglyNode head) {
        SinglyNode currentNode = head;
        StringBuilder sb = new StringBuilder();
        while (currentNode.next != null) {
            sb.append(currentNode.val).append(",");
            currentNode = currentNode.next;
        }
        sb.append(currentNode.val);

        return sb.toString();
    }

}