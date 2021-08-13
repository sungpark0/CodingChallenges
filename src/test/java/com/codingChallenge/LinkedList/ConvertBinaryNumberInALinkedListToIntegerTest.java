package com.codingChallenge.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertBinaryNumberInALinkedListToIntegerTest {

    ConvertBinaryNumberInALinkedListToInteger test = new ConvertBinaryNumberInALinkedListToInteger();

    @Test
    void positiveTest() {
        test.insertAtHead(1);
        test.insertAtTail(0);
        test.insertAtTail(1);

        assertEquals(5, ConvertBinaryNumberInALinkedListToInteger.getDecimalValue(test.head));
    }

    @Test
    void negativeTest() {
        test.insertAtHead(0);
        test.insertAtTail(0);

        assertNotEquals(2, ConvertBinaryNumberInALinkedListToInteger.getDecimalValue(test.head));
    }

    @Test
    void positiveTestII() {
        test.insertAtHead(1);

        assertEquals(1, ConvertBinaryNumberInALinkedListToInteger.getDecimalValue(test.head));
    }

    @Test
    void negativeTestII() {
        test.insertAtHead(0);

        assertNotEquals(1, ConvertBinaryNumberInALinkedListToInteger.getDecimalValue(test.head));
    }



}