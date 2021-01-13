package com.codingChallenge.LinkedList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveLinkedListElementsTest {

    RemoveLinkedListElements list = new RemoveLinkedListElements();

    @Test
    void positiveTest() {
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(7);
        list.insertAtTail(3);
        list.insertAtTail(7);
        list.insertAtTail(4);
        list.insertAtTail(7);
        list.insertAtTail(5);
        SinglyNode listRemove = RemoveLinkedListElements.removeElements(list.head, 7);
        List<Integer> test = new ArrayList<>();
        while (listRemove != null) {
            test.add(listRemove.val);
            listRemove = listRemove.next;
        }
        assertEquals(List.of(1, 2, 3, 4, 5), test);
    }

    @Test
    void negativeTest() {
        list.insertAtHead(1);
        list.insertAtTail(1);
        list.insertAtTail(1);
        SinglyNode listRemove = RemoveLinkedListElements.removeElements(list.head, 1);
        List<Integer> test = new ArrayList<>();
        while (listRemove != null) {
            test.add(listRemove.val);
            listRemove = listRemove.next;
        }
        assertNotEquals(List.of(1, 1, 1), test);
    }

}