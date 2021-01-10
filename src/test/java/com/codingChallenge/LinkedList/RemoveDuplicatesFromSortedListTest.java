package com.codingChallenge.LinkedList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListTest {

    RemoveDuplicatesFromSortedList list = new RemoveDuplicatesFromSortedList();

    @Test
    void positiveTest() {
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(2);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtTail(5);
        SinglyNode current = RemoveDuplicatesFromSortedList.deleteDuplicates(list.head);
        List<Integer> test = new ArrayList<>();
        while (current != null) {
            test.add(current.val);
            current = current.next;
        }
        assertEquals(List.of(1, 2, 3, 4, 5), test);
    }

    @Test
    void negativeTest() {
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(2);
        list.insertAtTail(3);
        SinglyNode current = RemoveDuplicatesFromSortedList.deleteDuplicates(list.head);
        List<Integer> test = new ArrayList<>();
        while (current != null) {
            test.add(current.val);
            current = current.next;
        }
        assertNotEquals(List.of(1, 2, 2, 3), test);
    }

}