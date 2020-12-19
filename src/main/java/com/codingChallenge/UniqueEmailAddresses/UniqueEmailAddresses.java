package com.codingChallenge.UniqueEmailAddresses;

import java.util.HashSet;

public class UniqueEmailAddresses {

    public static void main(String[] args) {

        String[] arr = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmailsII(arr));
    }

    public static int numUniqueEmails(String[] emails) {
        HashSet<String> hashSet = new HashSet<>();
        for (String email : emails) {
            int at = email.indexOf("@");
            String beforeAt = email.substring(0, at);
            String afterAt = email.substring((at + 1), email.length());
            char[] beforeAtChar = beforeAt.toCharArray();
            char[] afterAtChar = afterAt.toCharArray();
            StringBuilder temp = new StringBuilder();
            for (char ch : beforeAtChar) {
                if (ch == '.') {
                    continue;
                }
                if (ch == '+') {
                    break;
                }
                temp.append(ch);
            }

            temp.append('@');

            for (char ch : afterAtChar) {
                temp.append(ch);
            }
            hashSet.add(temp.toString());
        }

        return hashSet.size();
    }

    public static int numUniqueEmailsII(String[] emails) {
        HashSet<String> hashSet = new HashSet<>();

        for (String email : emails) {
            String[] temp = email.split("@");
            temp[0] = temp[0].replaceAll("\\.", "");
            String[] finalTemp = temp[0].split("\\+");

            hashSet.add(finalTemp[0] + "@" + temp[1]);
        }

        return hashSet.size();
    }

}
