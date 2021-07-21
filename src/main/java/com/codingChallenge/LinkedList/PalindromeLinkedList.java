package com.codingChallenge.LinkedList;

import java.util.Stack;

public class PalindromeLinkedList extends SinglyLinkedList {

    public static boolean isPalindrome(SinglyNode head) {
        if (head == null || head.next == null) return true;
        Stack<Integer> stack = new Stack<>();
        int length = getLength(head);
        boolean isEven = true;
        if (length % 2 != 0) {
            isEven = false;
        }
        length = length / 2;
        for (int i = 0; i < length; i++) {
            stack.add(head.val);
            head = head.next;
        }
        if (!isEven) {
            head = head.next;
        }
        while (head != null) {
            if (head.val == stack.peek()) {
                stack.pop();
                head = head.next;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int getLength(SinglyNode head) {
        SinglyNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public boolean isPalindromeII(SinglyNode head) {
        Stack<Integer> stack = new Stack<>();
        int length = 0;

        SinglyNode currNode = head;
        while (currNode != null) {
            length++;
            currNode = currNode.next;
        }

        for (int i = 0; i < length / 2; i++) {
            stack.add(head.val);
            head = head.next;
        }

        if (length % 2 != 0) head = head.next;

        while (head != null) {
            if (stack.peek() != head.val) return false;
            else {
                head = head.next;
                stack.pop();
            }
        }

        return true;
    }

    public static void main(String[] args) {

        PalindromeLinkedList list = new PalindromeLinkedList();

        list.insertAtHead(2);
        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtTail(4);


        System.out.println(getLength(list.head));
    }
}
