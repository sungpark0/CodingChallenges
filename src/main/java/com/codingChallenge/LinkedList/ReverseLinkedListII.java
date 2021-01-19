package com.codingChallenge.LinkedList;

public class ReverseLinkedListII extends SinglyLinkedList {

    public static SinglyNode reverseBetween(SinglyNode head, int m, int n) {
        SinglyNode dummyNode = new SinglyNode();
        dummyNode.next = head;
        SinglyNode beforeReverse = dummyNode;
        int i = 1;

        while (beforeReverse != null && i < m) {
            i++;
            beforeReverse = beforeReverse.next;
        }

        SinglyNode afterReverse = beforeReverse.next;
        SinglyNode currNode = afterReverse.next;

        while (currNode != null && i < n) {
            afterReverse.next = currNode.next;
            currNode.next = beforeReverse.next;
            beforeReverse.next = currNode;
            currNode = afterReverse.next;
            i++;
        }

        return dummyNode.next;
    }

    public static void main(String[] args) {

    }
}
