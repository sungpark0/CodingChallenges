package com.codingChallenge.BaseballGame;

import java.util.*;

public class BaseballGame {
    public static int calPoints(String[] ops) {
        List<Integer> records = new ArrayList<>();
        int result = 0;

        records.add(Integer.parseInt(ops[0]));

        for (int i = 1; i < ops.length; i++) {
            switch (ops[i]) {
                case "C":
                    records.remove(records.size() - 1);
                    break;
                case "D":
                    records.add(records.get(records.size() - 1) * 2);
                    break;
                case "+":
                    records.add(records.get(records.size() - 1) + records.get(records.size() - 2));
                    break;
                default:
                    records.add(Integer.parseInt(ops[i]));
                    break;
            }
        }

        for (Integer record : records) result += record;

        return result;
    }

    public static void main(String[] args) {

    }
}
