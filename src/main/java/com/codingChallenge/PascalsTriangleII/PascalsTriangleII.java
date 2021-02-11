package com.codingChallenge.PascalsTriangleII;

import java.util.*;

public class PascalsTriangleII {

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        List<Integer> prevList = new ArrayList<>();
        if (rowIndex == 0) {
            result.add(1);
            return result;
        }

        if (rowIndex == 1) {
            result.add(1);
            result.add(1);
            return result;
        }

        prevList = getRow(rowIndex - 1);

        result.add(1);

        for (int i = 1; i < prevList.size(); i++) {
            result.add(prevList.get(i) + prevList.get(i - 1));
        }

        result.add(1);

        return result;
    }

    public static void main(String[] args) {

    }
}
