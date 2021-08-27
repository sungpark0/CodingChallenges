package com.codingChallenge.GoatLatin;

public class GoatLatin {

    public static String toGoatLatin(String sentence) {
        String[] str = sentence.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            String temp = str[i];
            ans.append(temp);

            if (temp.charAt(0) == 'a' || temp.charAt(0) == 'e' || temp.charAt(0) == 'i' || temp.charAt(0) == 'o' || temp.charAt(0) == 'u' ||
                    temp.charAt(0) == 'A' || temp.charAt(0) == 'E' || temp.charAt(0) == 'I' || temp.charAt(0) == 'O' || temp.charAt(0) == 'U') {
                ans.append("ma");
            } else {
                ans.deleteCharAt(ans.length() - temp.length()).append(temp.charAt(0));
                ans.append("ma");
            }
            for (int j = 0; j <= i; j++) {
                ans.append("a");
            }

            ans.append(" ");
        }

        return ans.toString().trim();
    }


    public static void main(String[] args) {

    }
}
