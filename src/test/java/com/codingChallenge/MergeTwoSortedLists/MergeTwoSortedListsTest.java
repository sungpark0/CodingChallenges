package com.codingChallenge.MergeTwoSortedLists;

import com.codingChallenge.LinkedList.MergeTwoSortedLists;
import com.codingChallenge.LinkedList.ReverseLinkedList;
import com.codingChallenge.LinkedList.SinglyLinkedList;
import com.codingChallenge.LinkedList.SinglyNode;
import com.codingChallenge.MergeSort.MergeSort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
    MergeTwoSortedLists l1 = new MergeTwoSortedLists();
    MergeTwoSortedLists l2 = new MergeTwoSortedLists();

    @Test
    void positiveTest() {
        l1.insertAtHead(1);
        l1.insertAtTail(2);
        l1.insertAtTail(4);
        l2.insertAtHead(1);
        l2.insertAtTail(3);
        l2.insertAtTail(4);
        SinglyNode temp = MergeTwoSortedLists.mergeTwoLists(l1.head, l2.head);
        List<Integer> test = new ArrayList<>();

        while (temp != null) {
            test.add(temp.val);
            temp = temp.next;
        }
        assertEquals(List.of(1, 1, 2, 3, 4, 4), test);
    }

    @Test
    void positiveTestRecursion() {
        l1.insertAtHead(1);
        l1.insertAtTail(5);
        l1.insertAtTail(7);
        l2.insertAtHead(3);
        l2.insertAtTail(5);
        l2.insertAtTail(9);
        SinglyNode temp = MergeTwoSortedLists.mergeTwoListsRecursion(l1.head, l2.head);
        List<Integer> test = new ArrayList<>();

        while (temp != null) {
            test.add(temp.val);
            temp = temp.next;
        }
        assertEquals(List.of(1, 3, 5, 5, 7, 9), test);
    }

    @Test
    void positiveTestMergeSort() {
        int[] test = new int[]{3, 5, 1, 7, 4, 2};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 7}, MergeSort.sortArrayII(test));
    }

    @Test
    void negativeTestMergeSort() {
        int[] negTest = new int[]{20, 5, 15, 10, 7};
        assertNotEquals(new int[]{5, 7, 10, 20, 15}, MergeSort.sortArrayII(negTest));
    }

    @Test
    void positiveTestII() {
        l1.insertAtHead(1);
        l1.insertAtTail(2);
        l1.insertAtTail(4);
        l2.insertAtHead(1);
        l2.insertAtTail(3);
        l2.insertAtTail(4);
        List<Integer> test = new ArrayList<>();
        SinglyNode node = MergeTwoSortedLists.mergeTwoListsII(l1.head, l2.head);

        while (node != null) {
            test.add(node.val);
            node = node.next;
        }

        assertEquals(List.of(1, 1, 2, 3, 4, 4), test);
    }

    @Test
    void negativeTestII() {
        l1.insertAtHead(1);
        l2.insertAtHead(1);
        List<Integer> negTest = new ArrayList<>();
        SinglyNode node = MergeTwoSortedLists.mergeTwoListsII(l1.head, l2.head);

        while (node != null) {
            negTest.add(node.val);
            node = node.next;
        }

        assertNotEquals(List.of(1), negTest);
    }

}