package com.codingChallenge.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoLinkedLists extends SinglyLinkedList{

    public static SinglyNode getIntersectionNode(SinglyNode headA, SinglyNode headB) {
        Map<SinglyNode, Integer> map = new HashMap<>();

        while(headA!=null){ //inputting headA to map
            map.put(headA,headA.val);
            headA=headA.next;
        }

        while(headB!=null){ //checking if any repeated
            if(map.containsKey(headB)) return headB;
            headB= headB.next;
        }

        return null;
    }
    public static void main(String[] args) {
        
    }
}
