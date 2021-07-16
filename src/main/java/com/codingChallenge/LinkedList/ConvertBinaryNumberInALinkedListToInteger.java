package com.codingChallenge.LinkedList;

public class ConvertBinaryNumberInALinkedListToInteger extends SinglyLinkedList {

    public static int getDecimalValue(SinglyNode head) {
        int decimalValue = 0;

        while (head != null) {
            decimalValue = decimalValue * 2 + head.val;
            head = head.next;
        }

        return decimalValue;
    }

    public static void main(String[] args) {

    }
}
