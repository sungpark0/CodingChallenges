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
//        System.out.println( vowels( "Pope Is pope" ) );
//        System.out.println( vowelsSecond( "Pope Is Pope" ) );

        System.out.println(countVowels("Pope is"));
    }

    public static int vowels(String str) {
        String vowelList = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < vowelList.length(); i++) {
            if (vowelList.charAt( i ) == 'a' || vowelList.charAt( i ) == 'e' || vowelList.charAt( i ) == 'i'
                    || vowelList.charAt( i ) == 'o' || vowelList.charAt( i ) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static int vowelsSecond(String str) {
        str = str.toLowerCase();
        int count = 0;

        String[] array1 = str.split( "" );
        CharSequence A = "a";
        CharSequence E = "e";
        CharSequence I = "i";
        CharSequence O = "o";
        CharSequence U = "u";

        for (int i = 0; i < str.length(); i++) {
            if (array1[i].contains( A ) || array1[i].contains( E ) || array1[i].contains( I ) || array1[i].contains( O ) || array1[i].contains( U )) {
                count++;
            }
        }

        return count;
    }

    public static long countVowels(String sentence) {
        List<String> vowels = List.of("a", "e", "i", "o", "u");

        return Arrays.stream(sentence.split("")).filter(vowels::contains).count();
    }
}


