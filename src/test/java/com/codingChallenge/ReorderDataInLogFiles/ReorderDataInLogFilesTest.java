package com.codingChallenge.ReorderDataInLogFiles;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ReorderDataInLogFilesTest {

    @Test
    void positiveTest() {
        String[] test = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        assertArrayEquals(new String[]{"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"}, ReorderDataInLogFiles.reorderLogFiles(test));
    }

    @Test
    void negativeTest() {
        String[] test = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo","a2 act car"};
        String[] incorrect = {"a2 act car","g1 act car","a2 act car","g1 act car","a8 act zoo","ab1 off key dog"};
        assertFalse(Arrays.equals(incorrect, ReorderDataInLogFiles.reorderLogFiles(test)));
    }
}