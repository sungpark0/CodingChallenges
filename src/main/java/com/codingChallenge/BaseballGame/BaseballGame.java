package com.codingChallenge.BaseballGame;

import java.util.*;

public class BaseballGame {
    public static int calPoints(String[] ops) {
        List<Integer> records = new ArrayList<>();
        int result = 0;

        records.add(Integer.parseInt(ops[0]));

        for (int i = 1; i < ops.length; i++) {
            if ("C".equals(ops[i])) {
                records.remove(records.size() - 1);
            } else if ("D".equals(ops[i])) {
                records.add(records.get(records.size() - 1) * 2);
            } else if ("+".equals(ops[i])) {
                records.add(records.get(records.size() - 1) + records.get(records.size() - 2));
            } else {
                records.add(Integer.parseInt(ops[i]));
            }
        }

        for (Integer record : records) result += record;

        return result;
    }

    public static void main(String[] args) {

    }
}
