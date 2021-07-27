package com.codingChallenge.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleIITest {

    LinkedListCycleII list = new LinkedListCycleII();

    @Test
    void positiveTest() {
        list.insertAtHead(3);
        list.insertAtTail(2);
        list.insertAtTail(0);
        list.insertAtTail(-4);
        SinglyNode temp = list.head;
        SinglyNode circle = list.head.next;
        SinglyNode test = list.head;
        while (true) {
            if (temp.next == null) {
                temp.next = circle;
                break;
            }
            temp = temp.next;
        }
        assertEquals(2, (LinkedListCycleII.detectCycleII(test)).val);
    }

    @Test
    void negativeTest() {
        list.insertAtHead(3);
        list.insertAtTail(2);
        list.insertAtTail(0);
        list.insertAtTail(-4);
        assertNull(LinkedListCycleII.detectCycleII(list.head));
    }

    @Test
    void positiveTestII() {
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        SinglyNode temp = list.head;
        SinglyNode cycle = list.head.next;
        SinglyNode test = list.head;
        while (true) {
            if (temp.next == null) {
                temp.next = cycle;
                break;
            }
            temp = temp.next;
        }
        assertEquals(2, (LinkedListCycleII.detectCycle(test)).val);
    }

    @Test
    void negativeTestII() {
        list.insertAtHead(3);
        list.insertAtTail(2);
        list.insertAtTail(1);
        assertNull(LinkedListCycleII.detectCycle(list.head));
    }

}