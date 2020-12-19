package com.codingChallenge.MergeTwoSortedLists;

import java.util.*;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummyNodeList = new ListNode();
        ListNode temp = dummyNodeList;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                dummyNodeList.next = l1;
                l1 = l1.next;
                dummyNodeList = dummyNodeList.next;
            } else {
                dummyNodeList.next = l2;
                l2 = l2.next;
                dummyNodeList = dummyNodeList.next;
            }
        }
        if (l1 != null) {
            dummyNodeList.next = l1;
        }
        if (l2 != null) {
            dummyNodeList.next = l2;
        }

        return temp.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
