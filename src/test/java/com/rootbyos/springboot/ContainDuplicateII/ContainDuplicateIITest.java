package com.rootbyos.springboot.ContainDuplicateII;

import com.rootbyos.springboot.ContainDuplicate.ContainDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainDuplicateIITest {

    @Test
    void positiveTest() {
        int[] test = {1, 2, 3, 1};
        assertEquals( true, ContainDuplicate.containDuplicate( test ) );
    }

    @Test
    void negativeTest() {
        int[] test = {1, 2, 3, 1, 2, 3};
        assertNotEquals( false, ContainDuplicate.containDuplicate( test ) );
    }

}