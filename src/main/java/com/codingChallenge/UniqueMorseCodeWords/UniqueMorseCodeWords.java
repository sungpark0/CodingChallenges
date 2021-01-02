package com.codingChallenge.UniqueMorseCodeWords;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] strs = {"vtpke","vngc","vnqr","gbzx","qvdx"};
        System.out.println(uniqueMorseRepresentations(strs));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        HashSet<String> results = new HashSet<>();
        Map<Character, String> map = new HashMap<>();
        map.put('a', ".-");
        map.put('b', "-...");
        map.put('c', "-.-.");
        map.put('d', "-..");
        map.put('e', ".");
        map.put('f', "..-.");
        map.put('g', "--.");
        map.put('h', "....");
        map.put('i', "..");
        map.put('j', ".---");
        map.put('k', "-.-");
        map.put('l', ".-..");
        map.put('m', "--");
        map.put('n', "-.");
        map.put('o', "---");
        map.put('p', ".--.");
        map.put('q', "--.-");
        map.put('r', ".-.");
        map.put('s', "...");
        map.put('t', "-");
        map.put('u', "..-");
        map.put('v', "...-");
        map.put('w', ".--");
        map.put('x', "-..-");
        map.put('y', "-.--");
        map.put('z', "--..");

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            char[] ch = word.toCharArray();
            for (char c : ch) {
                if (map.containsKey(c)) {
                    sb.append(map.get(c));
                }
            }
            results.add(sb.toString());
        }
        return results.size();
    }
}
