package com.codingChallenge.StringMatchingInAnArray;

import java.util.*;
import java.util.stream.Collectors;

public class StringMatchingInAnArray {
    public static void main(String[] args) {
        String[] test = {"mass", "as", "as", "hero", "superhero"};

        System.out.println( stringMatching( test ) );
        System.out.println( stringMatchingTwo( test ) );
    }

    public static List<String> stringMatching(String[] words) {

        List<String> holder = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].contains( words[j] ) && i != j && !holder.contains( words[j] )) {
                    holder.add( words[j] );
                }
            }
        }
        return holder;
    }

    public static List<String> stringMatchingTwo(String[] words) {

        List<String> answer = new ArrayList<>();
        Stack<String> temp = new Stack<>();

        for (String a : words) {
            for (String b : words) {
                if (!a.equals( b ) && a.contains( b )) {
                    answer.add( b );
                }
            }
        }

//        for (String i : answer) {
//            if (temp.isEmpty()) {
//                temp.add( i );
//            } else {
//                if (temp.lastElement().equals( i )) {
//                    temp.add( i );
//                    temp.pop();
//                } else {
//                    temp.add( i );
//                }
//            }
//        }

        return answer.stream().distinct().collect(Collectors.toList()); //distinct
    }

    public static List<String> stringMatchingThree(String[] words) {
//        String[] test = {"mass", "as", "as", "hero", "superhero"};

        Map<String, List<String>> map = new HashMap<>();

        Arrays.sort(words, (a, b) -> Integer.compare(b.length(), a.length()));
        // superhero mass hero as as

        for (String word : words) {
            List<String> list = new ArrayList<>();
            map.put(word, list);


            map.forEach((k, v) -> {
                if (k.length() > word.length() && k.contains(word)) {
                    v.add(word);
                    map.put(k, v);
                    // superhero hero
                }
            });

        }

        return map.values().stream()
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
    }
}


