package com.codingChallenge.ReorderDataInLogFiles;

import java.util.*;

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
        for (int i = 0; i < letWords.size(); i++) {
            result[i] = letWords.get(i);
        }

        int k = 0;
        for (int i = letWords.size(); i < result.length; i++) {
            result[i] = digWords.get(k);
            k++;
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
//
//    public String[] reorderLogFilesII(String[] logs) {
//        String[] result = new String[logs.length];
//        List<Integer> indexes = new ArrayList<>();
//        List<String> digSorted = new ArrayList<>();
//        List<String> letWords = new ArrayList<>();
//        List<String> letUnsorted = new ArrayList<>();
//        List<String> letSorted = new ArrayList<>();
//
//        for (String log : logs) { //getting index of 1 after identifier
//            indexes.add(log.indexOf(" "));
//        }
//
//        //separating letters and digits
//        for (int i = 0; i < indexes.size(); i++) {
//            if (Character.isDigit(logs[i].charAt((indexes.get(i) + 1)))) {
//                digSorted.add(logs[i]);
//            } else letWords.add(logs[i]);
//        }
//
//        //letter sorting
//        Collections.sort(letWords);
//        for (int i = 0; i < letWords.size(); i++) {
//            letUnsorted.add(letWords.get(i).substring((letWords.get(i).indexOf(" ") + 1), letWords.get(i).length()));
//        }
//        Collections.sort(letUnsorted);
//        indexes.clear();
//        for (int i = 0; i < letUnsorted.size(); i++) {
//            for (int j = 0; j < letUnsorted.size(); j++) {
//                if (letWords.get(j).contains(letUnsorted.get(i))) {
//                    indexes.add(j);
//                }
//            }
//        }
//        for (int i = 0; i < indexes.size(); i++) {
//            letSorted.add(letWords.get(indexes.get(i)));
//        }
//
//        //Inputting letSorted and digSorted into String[] result
//        for (int i = 0; i < letSorted.size(); i++) {
//            result[i] = letSorted.get(i);
//        }
//        int k = 0;
//        for (int i = letSorted.size(); i < result.length; i++) {
//            result[i] = digSorted.get(k);
//            k++;
//        }
//
//        return result;
//    }
}
