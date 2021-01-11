package com.codingChallenge.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoLinkedListsTest {

    IntersectionOfTwoLinkedLists listA = new IntersectionOfTwoLinkedLists();
    IntersectionOfTwoLinkedLists listB = new IntersectionOfTwoLinkedLists();

    @Test
    void positiveTest(){
        listA.insertAtHead(4);
        listA.insertAtTail(1);
        listA.insertAtTail(8);

        listB.insertAtHead(5);
        listB.insertAtTail(2);

        SinglyNode tempA= listA.head;
        SinglyNode tempB= listB.head;
        SinglyNode intersectingNode = new SinglyNode(7);

        while(tempA!=null){
            if(tempA.next==null){
                tempA.next=intersectingNode;
                tempA.next.next=new SinglyNode(9);
                break;
            }
            tempA=tempA.next;
        }

        while(tempB!=null){
            if(tempB.next==null){
                tempB.next = intersectingNode;
                break;
            }
            tempB=tempB.next;
        }

        SinglyNode testA= listA.head;
        SinglyNode testB= listB.head;

        SinglyNode result = IntersectionOfTwoLinkedLists.getIntersectionNode(testA, testB);
        assertEquals(7,result.val);
    }

    @Test
    void negativeTest(){
        listA.insertAtHead(4);
        listA.insertAtTail(1);
        listA.insertAtTail(8);

        listB.insertAtHead(5);
        listB.insertAtTail(2);

        SinglyNode result = IntersectionOfTwoLinkedLists.getIntersectionNode(listA.head, listB.head);
        assertNull(result);
    }

}