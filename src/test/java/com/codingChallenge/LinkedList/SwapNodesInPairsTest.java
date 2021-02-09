package com.codingChallenge.LinkedList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {

    SwapNodesInPairs list = new SwapNodesInPairs();

    @Test
    void positiveTest() {
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);

        SinglyNode temp = SwapNodesInPairs.swapPairs(list.head);
        List<Integer> test = new ArrayList<>();
        while (temp != null) {
            test.add(temp.val);
            temp = temp.next;
        }
        assertEquals(List.of(2, 1, 4, 3), test);
    }

    @Test
    void negativeTest() {
        list.insertAtHead(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);

        SinglyNode temp = SwapNodesInPairs.swapPairs(list.head);
        List<Integer> negTest = new ArrayList<>();
        while (temp != null) {
            negTest.add(temp.val);
            temp = temp.next;
        }
        assertNotEquals(List.of(4, 3, 2, 1), negTest);
    }


}