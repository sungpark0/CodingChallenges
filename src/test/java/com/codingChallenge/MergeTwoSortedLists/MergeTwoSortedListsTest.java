package com.codingChallenge.MergeTwoSortedLists;

import com.codingChallenge.LinkedList.MergeTwoSortedLists;
import com.codingChallenge.LinkedList.ReverseLinkedList;
import com.codingChallenge.LinkedList.SinglyLinkedList;
import com.codingChallenge.LinkedList.SinglyNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
    MergeTwoSortedLists l1 = new MergeTwoSortedLists();
    MergeTwoSortedLists l2 = new MergeTwoSortedLists();

    @Test
    void positiveTest(){
        l1.insertAtHead(1);
        l1.insertAtTail(2);
        l1.insertAtTail(4);
        l2.insertAtHead(1);
        l2.insertAtTail(3);
        l2.insertAtTail(4);
        SinglyNode temp = MergeTwoSortedLists.mergeTwoLists(l1.head,l2.head);
        List<Integer> test = new ArrayList<>();

        while(temp != null){
            test.add(temp.val);
            temp=temp.next;
        }
        assertEquals(List.of(1,1,2,3,4,4) , test);
    }

}