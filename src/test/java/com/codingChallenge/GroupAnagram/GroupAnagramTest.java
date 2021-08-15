package com.codingChallenge.GroupAnagram;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramTest {

    @Test
    void positiveTest() {
        assertEquals(List.of(List.of("eat", "tea", "ate"), List.of("bat"), List.of("tan", "nat")),
                GroupAnagram.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})
        );
    }

    @Test
    void negativeTest() {
        assertNotEquals(List.of(List.of(" ")), GroupAnagram.groupAnagrams(new String[]{"a", "b"}));
    }

    @Test
    void positiveTestII() {
        assertEquals(List.of(List.of("abc", "cba"), List.of("cde", "edc"), List.of("fig")),
                GroupAnagram.groupAnagrams(new String[]{"abc", "cde", "cba", "edc", "fig"})
        );
    }

    @Test
    void negativeTestII() {
        assertNotEquals(List.of(List.of(" ")), GroupAnagram.groupAnagrams(new String[]{"a"}));
    }

}