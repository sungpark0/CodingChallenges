package com.codingChallenge.LinkedList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenLinkedListTest {

    OddEvenLinkedList list = new OddEvenLinkedList();

    @Test
    void positiveTest(){
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        list.insertAtTail(6);
        SinglyNode current = OddEvenLinkedList.oddEvenList(list.head);
        List<Integer> test = new ArrayList<>();
        while(current!=null){
            test.add(current.val);
            current=current.next;
        }
        assertEquals(List.of(1,3,5,2,4,6), test);
    }

    @Test
    void negativeTest(){
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        SinglyNode curr = OddEvenLinkedList.oddEvenList(list.head);
        List<Integer> test = new ArrayList<>();
        while(curr!=null){
            test.add(curr.val);
            curr=curr.next;
        }
        assertNotEquals(List.of(1,2,3,4), test);
    }
}