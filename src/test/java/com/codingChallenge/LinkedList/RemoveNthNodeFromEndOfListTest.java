package com.codingChallenge.LinkedList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {

    RemoveNthNodeFromEndOfList list = new RemoveNthNodeFromEndOfList();

    @Test
    void positiveTest() {
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        SinglyNode temp = RemoveNthNodeFromEndOfList.removeNthFromEnd(list.head, 3);
        List<Integer> test = new ArrayList<>();
        while (temp != null) {
            test.add(temp.val);
            temp = temp.next;
        }
        assertEquals(List.of(1, 2, 4, 5), test);
    }

    @Test
    void negativeTest() {
        list.insertAtHead(1);
        SinglyNode temp = RemoveNthNodeFromEndOfList.removeNthFromEnd(list.head, 1);
        List<Integer> test = new ArrayList<>();
        while (temp != null) {
            test.add(temp.val);
            temp = temp.next;
        }
        assertNotEquals(List.of(1), test);
    }

    @Test
    void whenNEqualsLength() {
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        SinglyNode temp = RemoveNthNodeFromEndOfList.removeNthFromEnd(list.head, 5);
        List<Integer> test = new ArrayList<>();
        while (temp != null) {
            test.add(temp.val);
            temp = temp.next;
        }
        assertEquals(List.of(2, 3, 4, 5), test);
    }

    @Test
    void positiveTestII() {
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        SinglyNode temp = RemoveNthNodeFromEndOfList.removeNthFromEndII(list.head, 3);
        List<Integer> test = new ArrayList<>();
        while (temp != null) {
            test.add(temp.val);
            temp = temp.next;
        }
        assertEquals(List.of(1, 2, 4, 5), test);
    }

    @Test
    void negativeTestII() {
        list.insertAtHead(1);
        list.insertAtTail(2);
        SinglyNode temp = RemoveNthNodeFromEndOfList.removeNthFromEndII(list.head, 1);
        List<Integer> test = new ArrayList<>();
        while (temp != null) {
            test.add(temp.val);
            temp = temp.next;
        }

        assertNotEquals(List.of(1, 2), test);
    }

}