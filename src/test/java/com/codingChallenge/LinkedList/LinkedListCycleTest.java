package com.codingChallenge.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    LinkedListCycle list = new LinkedListCycle();

    @Test
    void positiveTest(){
        list.insertAtHead(3);
        list.insertAtTail(2);
        list.insertAtTail(0);
        list.insertAtTail(-4);
        SinglyNode temp = list.head;
        SinglyNode circle = list.head;
        while(temp!=null){
            if(temp.next==null){
                temp.next = circle;
                break;
            }
            temp=temp.next;
        }
        assertTrue(LinkedListCycle.hasCycle(circle));
    }

    @Test
    void negativeTest(){
        list.insertAtHead(3);
        list.insertAtTail(2);
        list.insertAtTail(0);
        list.insertAtTail(-4);
        SinglyNode test = list.head;
        assertFalse(LinkedListCycle.hasCycle(test));
    }

}