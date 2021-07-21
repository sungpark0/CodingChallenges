package com.codingChallenge.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {

    PalindromeLinkedList test = new PalindromeLinkedList();

    @Test
    void positiveTest(){
        test.insertAtHead(1);
        test.insertAtTail(2);
        test.insertAtTail(3);
        test.insertAtTail(2);
        test.insertAtTail(1);
        assertTrue(PalindromeLinkedList.isPalindrome(test.head));
    }

    @Test
    void negativeTest(){
        test.insertAtHead(1);
        test.insertAtTail(2);
        test.insertAtTail(3);
        test.insertAtTail(4);
        test.insertAtTail(5);
        assertFalse(PalindromeLinkedList.isPalindrome(test.head));
    }


}