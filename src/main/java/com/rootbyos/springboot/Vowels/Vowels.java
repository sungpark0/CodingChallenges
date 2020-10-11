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

    public static void main(String[] args) {
        System.out.println(vowels("Pope Is pope"));
    }
    public static int vowels(String str) {

        String vowelList = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < vowelList.length(); i++)
        {
            if (vowelList.charAt(i) == 'a' || vowelList.charAt(i) == 'e' || vowelList.charAt(i) == 'i'
                    || vowelList.charAt(i) == 'o' || vowelList.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}

//    public static long countVowels(String sentence) {
//        List<String> vowels = List.of("a", "e", "i", "o", "u");
//
//        return Arrays.stream(sentence.split("")).filter(vowels::contains).count();
//    }
