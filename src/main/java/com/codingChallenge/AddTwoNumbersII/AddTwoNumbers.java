package com.codingChallenge.AddTwoNumbersII;

import com.codingChallenge.LinkedList.SinglyLinkedList;
import com.codingChallenge.LinkedList.SinglyNode;

public class AddTwoNumbers extends SinglyLinkedList {

    public static SinglyNode addTwoNumbers(SinglyNode l1, SinglyNode l2) {

        l1 = reverse(l1);
        l2 = reverse(l2);

        int carry = 0;
        SinglyNode ans = null;
        while (l1 != null || l2 != null || carry != 0) {
            int curr = carry;
            if (l1 != null) {
                curr += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                curr += l2.val;
                l2 = l2.next;
            }

            carry = curr / 10;
            SinglyNode node = new SinglyNode(curr % 10);
            node.next = ans;
            ans = node;
        }

        return ans;
    }

    public static SinglyNode reverse(SinglyNode node) {
        SinglyNode prev = null;
        while (node != null) {
            SinglyNode curr = new SinglyNode(node.val);
            curr.next = prev;
            prev = curr;
            node = node.next;
        }
        return prev;
    }

    public static void main(String[] args) {

    }
}
