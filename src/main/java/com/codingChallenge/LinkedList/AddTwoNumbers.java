package com.codingChallenge.LinkedList;

public class AddTwoNumbers extends SinglyLinkedList {

    public static SinglyNode addTwoNumbers(SinglyNode l1, SinglyNode l2) {

        SinglyNode dummyNode = new SinglyNode();
        SinglyNode currNode = dummyNode;
        int checker = 0;
        int sum = 0;

        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + checker;
            if (sum > 9) checker = 1;
            else checker = 0;
            currNode.next = new SinglyNode(sum % 10);
            currNode = currNode.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 != null) while (l1 != null) {
            sum = l1.val + checker;
            if (sum > 9) checker = 1;
            else checker = 0;
            currNode.next = new SinglyNode(sum % 10);
            currNode = currNode.next;
            l1 = l1.next;
        }


        if (l2 != null) while (l2 != null) {
            sum = l2.val + checker;
            if (sum > 9) checker = 1;
            else checker = 0;
            currNode.next = new SinglyNode(sum % 10);
            currNode = currNode.next;
            l2 = l2.next;
        }

        if (checker == 1) {
            currNode.next = new SinglyNode(checker);
        }

        return dummyNode.next;
    }

    public static void main(String[] args) {

    }
}
