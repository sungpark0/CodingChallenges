package com.codingChallenge.PathSumII;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PathSumIITest {

    PathSumII test = new PathSumII();

    @Test
    void positiveTest() {
        test.insertRecursion(20);
        test.insertRecursion(5);
        test.insertRecursion(10);
        test.insertRecursion(25);
        test.insertRecursion(30);

        assertEquals(List.of(List.of(20, 5, 10)), PathSumII.pathSum(test.root, 35));
    }

    @Test
    void negativeTest() {
        test.insertRecursion(15);
        test.insertRecursion(5);
        test.insertRecursion(30);

        assertNotEquals(List.of(List.of(5, 15)), PathSumII.pathSum(test.root, 20));
    }

}