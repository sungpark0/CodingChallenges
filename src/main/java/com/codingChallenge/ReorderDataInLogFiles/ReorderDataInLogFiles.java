package com.codingChallenge.ReorderDataInLogFiles;

import java.util.*;
import java.util.stream.IntStream;

public class ReorderDataInLogFiles {
    public static void main(String[] args) {
        String[] str = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo", "a2 act car"};
        System.out.println(Arrays.toString(reorderLogFiles(str)));
    }

    public static String[] reorderLogFiles(String[] logs) {
        String[] result = new String[logs.length];
        List<Integer> indexes = new ArrayList<>();
        List<String> digWords = new ArrayList<>();
        List<String> letWords = new ArrayList<>();

        for (String log : logs) { //getting index of 1 after identifier
            indexes.add(log.indexOf(" "));
        }
        //separating letters and digits
        for (int i = 0; i < indexes.size(); i++) {
            if (Character.isDigit(logs[i].charAt((indexes.get(i) + 1)))) {
                digWords.add(logs[i]);
            } else letWords.add(logs[i]);
        }
        //letter sorting
        //letWord = {"g1 act car", "ab1 off key dog", a8 act zoo", "a2 act car"}
        letWords.sort((a, b) -> {
            int t = a.substring(a.indexOf(" ") + 1).compareTo(b.substring(b.indexOf(" ") + 1));
            if (t == 0)
                return a.substring(0, a.indexOf(" ")).compareTo(b.substring(0, b.indexOf(" ")));
            else
                return t;
        });

        //Inputting letSorted and digSorted into String[] result
        IntStream.range(0, letWords.size()).forEach(i -> result[i] = letWords.get(i));

        for (int i = letWords.size(), k = 0; i < result.length; i++, k++) {
            result[i] = digWords.get(k);
        }
        return result;
    }

    public static String[] reorderLogFilesII(String[] logs) {
        Arrays.sort(logs, (a, b) -> {
            int identA = a.indexOf(" ") + 1;
            int identB = b.indexOf(" ") + 1;

            boolean isLetterA = Character.isLetter(a.charAt(identA));
            boolean isLetterB = Character.isLetter(b.charAt(identB));

            if (isLetterA && isLetterB) {
                int compare = a.substring(identA).compareTo(b.substring(identB));

                if (compare != 0) return compare;
                return a.compareTo(b);
            } else if (isLetterA) {
                return -1;
            } else if (isLetterB) {
                return 1;
            } else return 0;
        });

        return logs;

    }
}
