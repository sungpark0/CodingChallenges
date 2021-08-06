package com.codingChallenge.RemoveComments;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveCommentsTest {

    @Test
    void positiveTest() {
        assertEquals(List.of("int main()", "{ ", "  ", "int a, b, c;", "a = b + c;", "}"),
                RemoveComments.removeComments(new String[]{
                        "/*Test program */", "int main()", "{ ", "  // variable declaration ", "int a, b, c;",
                        "/* This is a test", "   multiline  ", "   comment for ", "   testing */", "a = b + c;", "}"}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(List.of("alineb"), RemoveComments.removeComments(
                new String[]{"a/*comment", "line", "more_comment*/b"}));
    }

}