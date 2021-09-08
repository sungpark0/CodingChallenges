package com.codingChallenge.CopyListWithRandomPointer;

import com.codingChallenge.LinkedList.CopyListWithRandomPointer;
import com.codingChallenge.LinkedList.SinglyNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CopyListWithRandomPointerTest {

    CopyListWithRandomPointer test = new CopyListWithRandomPointer();

    @Test
    void positiveTest() {
        test.insertAtHead(7);
        test.insertAtTail(13);
        test.insertAtTail(11);
        test.insertAtTail(10);
        test.insertAtTail(1);

        List<Integer> list = new ArrayList<>();
        SinglyNode temp = CopyListWithRandomPointer.copyRandomList(test.head);

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        assertEquals(List.of(7, 13, 11, 10, 1), list);
    }

    @Test
    void negativeTest() {
        test.insertAtHead(7);
        test.insertAtTail(5);

        List<Integer> list = new ArrayList<>();
        SinglyNode temp = CopyListWithRandomPointer.copyRandomList(test.head);

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        assertNotEquals(List.of(5, 7), list);
    }

}