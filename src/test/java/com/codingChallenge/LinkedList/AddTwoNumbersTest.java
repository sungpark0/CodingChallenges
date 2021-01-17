package com.codingChallenge.LinkedList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    AddTwoNumbers listOne = new AddTwoNumbers();
    AddTwoNumbers listTwo = new AddTwoNumbers();

    @Test
    void positiveTest() {
        listOne.insertAtHead(1);
        listOne.insertAtTail(2);
        listOne.insertAtTail(3);

        listTwo.insertAtHead(2);
        listTwo.insertAtTail(3);
        listTwo.insertAtTail(4);
        SinglyNode temp = AddTwoNumbers.addTwoNumbers(listOne.head, listTwo.head);
        List<Integer> test = new ArrayList<>();
        while (temp != null) {
            test.add(temp.val);
            temp = temp.next;
        }
        assertEquals(List.of(3, 5, 7), test);
    }

    @Test
    void positiveTestOverTen() {
        listOne.insertAtHead(9);
        listOne.insertAtTail(9);
        listOne.insertAtTail(9);

        listTwo.insertAtHead(9);
        listTwo.insertAtTail(9);
        listTwo.insertAtTail(9);
        SinglyNode temp = AddTwoNumbers.addTwoNumbers(listOne.head, listTwo.head);
        List<Integer> test = new ArrayList<>();
        while (temp != null) {
            test.add(temp.val);
            temp = temp.next;
        }
        assertEquals(List.of(8, 9, 9, 1), test);
    }

    @Test
    void negativeTest() {
        listOne.insertAtHead(1);
        listOne.insertAtTail(2);
        listOne.insertAtTail(3);

        listTwo.insertAtHead(1);
        listTwo.insertAtTail(2);
        listTwo.insertAtTail(3);
        SinglyNode temp = AddTwoNumbers.addTwoNumbers(listOne.head, listTwo.head);
        List<Integer> test = new ArrayList<>();
        while (temp != null) {
            test.add(temp.val);
            temp = temp.next;
        }
        assertNotEquals(List.of(1, 2, 3), test);
    }
}