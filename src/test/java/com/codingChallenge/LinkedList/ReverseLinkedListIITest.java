package com.codingChallenge.LinkedList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListIITest {

    ReverseLinkedListII list = new ReverseLinkedListII();

    @Test
    void positiveTest() {
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        SinglyNode temp = ReverseLinkedList.reverseList(list.head);
        List<Integer> test = new ArrayList<>();
        while (temp != null) {
            test.add(temp.val);
            temp = temp.next;
        }
        assertEquals(List.of(5, 4, 3, 2, 1), test);
    }

    @Test
    void negativeTest() {
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        SinglyNode temp = ReverseLinkedList.reverseList(list.head);
        List<Integer> test = new ArrayList<>();
        while (temp != null) {
            test.add(temp.val);
            temp = temp.next;
        }
        assertNotEquals(List.of(1,2,3), test);
    }

}