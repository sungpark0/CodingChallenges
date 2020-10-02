package com.rootbyos.springboot.Vowels;

// — Directions
// Write a function that returns the number of vowels
// used in a string.  Vowels are the characters 'a', 'e'
// 'i', 'o', and 'u'.
// — Examples
//   vowels('Hi There!') —> 3
//   vowels('Why do you ask?') —> 4
//   vowels('Why?') —> 0

import java.util.Arrays;
import java.util.List;

public class Vowels {
    public static long countVowels(String sentence) {
        List<String> vowels = List.of("a", "e", "i", "o", "u");

        return Arrays.stream(sentence.split("")).filter(vowels::contains).count();
    }
}
