package com.codingChallenge.BinaryTreeRightSideView;

import com.codingChallenge.Tree.BinaryTreeInOrderTraversal;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeRightSideViewTest {

    BinaryTreeRightSideView test = new BinaryTreeRightSideView();

    @Test
    void positiveTest() {
        test.insertIteration(10);
        test.insertIteration(5);
        test.insertIteration(15);

        assertEquals(List.of(10, 15), BinaryTreeRightSideView.rightSideView(test.root));
    }

    @Test
    void negativeTest() {
        test.insertIteration(1);
        test.insertIteration(4);
        test.insertIteration(7);
        test.insertIteration(10);
        test.insertIteration(15);

        assertNotEquals(List.of(1, 7, 15), BinaryTreeRightSideView.rightSideView(test.root));
    }

}