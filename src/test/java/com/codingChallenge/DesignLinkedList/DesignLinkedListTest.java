package com.codingChallenge.DesignLinkedList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DesignLinkedListTest {

    DesignLinkedList test = new DesignLinkedList();

    @Test
    void positiveTestEmpty() {
        assertEquals(0, test.size);
    }

    @Test
    void positiveTestAddAtHead() {
        test.addAtHead(1);
        test.addAtHead(2);
        test.addAtHead(3);
        assertEquals(List.of(3, 2, 1), makeList(test));

    }

    @Test
    void positiveTestAddAtTail() {
        test.addAtTail(1);
        test.addAtTail(2);
        test.addAtTail(3);

        assertEquals(1, test.head.value);
        assertEquals(3, test.tail.value);
        assertEquals(List.of(1, 2, 3), makeList(test));
    }

    @Test
    void positiveTestAddAtIndex() {
        test.addAtIndex(0, 1);
        test.addAtIndex(1, 2);
        test.addAtIndex(1, 3);
        test.addAtIndex(0, 4);

        assertEquals(4, test.head.value);
        assertEquals(2, test.tail.value);
        assertEquals(List.of(4, 1, 3, 2), makeList(test));
    }

    @Test
    void positiveTestDeleteAtIndex() {
        test.addAtHead(1);
        test.addAtTail(2);
        test.addAtIndex(2, 3);
        test.deleteAtIndex(1);

        assertEquals(2, test.size);
        assertEquals(List.of(1, 3), makeList(test));
    }


    @Test
    void positiveTestList() {
        test.addAtTail(1);
        test.addAtTail(2);
        test.addAtTail(3);

        assertEquals(List.of(1, 2, 3), makeList(test));
    }

    public List<Integer> makeList(DesignLinkedList linkedList) {
        List<Integer> list = new ArrayList<>();

        DesignLinkedList.ListNode temp = linkedList.head;
        while (temp != null) {
            list.add(temp.value);
            temp = temp.next;
        }

        return list;
    }

}