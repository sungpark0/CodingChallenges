package com.codingChallenge.ReverseVowels;

/**
 * 345. Reverse Vowels of a String
 * Write a function that takes a string as input and reverse only the vowels of a string.
 *
 * Example 1:
 *
 * Input: "hello"
 * Output: "holle"
 * Example 2:
 *
 * Input: "leetcode"
 * Output: "leotcede"
 * Note:
 * The vowels does not include the letter "y".
 *
 */
public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels( "hello friends" ));
    }
    public static String reverseVowels(String str) {

        if ( str.length() == 0 ){
            return str;
        }
        String vowelString = "aeiouAEIOU";
        char [] vowels = str.toCharArray();

        int start = 0, end = str.length()-1;
        while(start<end){

            while(start<end && !vowelString.contains(vowels[start]+"")){
                start++;
            }

            while(start<end && !vowelString.contains(vowels[end]+"")){
                end--;
            }

            char temp = vowels[start];
            vowels[start] = vowels[end];
            vowels[end] = temp;
            start++;
            end--;
        }
        return new String(vowels);
    }

    public String reverseVowelsII(String s) {
        StringBuilder builder = new StringBuilder(s);

        int start = 0;
        int end = builder.length() - 1;

        while (start < end) {
            while(!isVowel(builder.charAt(start)) && start < end) {
                start++;
            }

            while (!isVowel(builder.charAt(end)) && start < end) {
                end--;
            }

            if (start < end) {
                char temp = builder.charAt(start);
                builder.setCharAt(start, builder.charAt(end));
                builder.setCharAt(end, temp);
                start++;
                end--;
            }
        }

        return builder.toString();
    }

    private boolean isVowel(char ch) {
        return (ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u' ||
                ch== 'A' ||
                ch == 'E' ||
                ch == 'I' ||
                ch == 'O' ||
                ch == 'U');
    }
}
// List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
//        // placeholder for vowels
//        Stack<Character> stack = new Stack<>();
//        char[] arr = str.toCharArray();
//        // hello
//        // 01234
//        int i = 0;
//        while (i < arr.length) {
//            if (vowels.contains(arr[i])) {
//                // [e,o]
//                stack.push(arr[i]);
//            }
//            i++;
//        }
//
//        int j = 0;
//        while (j < arr.length) {
//            // hello
//            // 01234
//            // [e,o]
//            if (vowels.contains(arr[j])) {
//                // stack = []
//                // vowel = e
//                char vowel = stack.pop();
//                //arr[j] = e
//                // hello -> holle
//                arr[j] = vowel;
//            }
//            j++;
//        }
//
//        return String.valueOf(arr);
//    }