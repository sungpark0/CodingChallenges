package com.codingChallenge.ReverseLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    ReverseLinkedList rLinkedList = new ReverseLinkedList();

    @Test
    void positiveTest() {
        rLinkedList.insertAtHead(1);
        rLinkedList.insertAtEnd(2);
        rLinkedList.insertAtEnd(3);
        rLinkedList.insertAtEnd(4);
        rLinkedList.insertAtEnd(5);
        ReverseLinkedList.ListNode linkedList = rLinkedList.head;
        ReverseLinkedList.ListNode test = ReverseLinkedList.reverseList(linkedList);

        assertEquals("5,4,3,2,1", createStringRepresentation(test));
    }

    @Test
    void negativeTest() {
        rLinkedList.insertAtHead(1);
        rLinkedList.insertAtEnd(2);
        rLinkedList.insertAtEnd(3);
        rLinkedList.insertAtEnd(4);
        rLinkedList.insertAtEnd(5);
        ReverseLinkedList.ListNode linkedList = rLinkedList.head;
        /**
         * only difference between positiveTest and negativeTest is utilizing reverseList method.
         */
        assertNotEquals("5,4,3,2,1", createStringRepresentation(linkedList));
    }


    public String createStringRepresentation(ReverseLinkedList.ListNode head) {
        ReverseLinkedList.ListNode currentNode = head;
        StringBuilder sb = new StringBuilder();
        while (currentNode.next != null) {
            sb.append(currentNode.data).append(",");
            currentNode = currentNode.next;
        }
        sb.append(currentNode.data);

        return sb.toString();
    }

}