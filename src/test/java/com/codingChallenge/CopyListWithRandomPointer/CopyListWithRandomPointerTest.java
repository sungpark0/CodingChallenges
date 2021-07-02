package com.codingChallenge.CopyListWithRandomPointer;

import com.codingChallenge.LinkedList.CopyListWithRandomPointer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CopyListWithRandomPointerTest {

    CopyListWithRandomPointer test = new CopyListWithRandomPointer();

    @Test
    void positiveTest() {
        test.insertAtHead(7);
        test.insertAtTail(13);
        test.insertAtTail(11);
        test.insertAtTail(10);
        test.insertAtTail(1);


    }

}