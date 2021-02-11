package com.codingChallenge.PascalsTriangle;

import java.util.*;

public class PascalsTriangle {

    public List<List<Integer>> generateNestedForLoop(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) return result;

        result.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 1; j < i; j++){
                List<Integer> prevLine = result.get(i-1);
                temp.add(prevLine.get(j) + prevLine.get(j-1));
            }
            temp.add(1);
            result.add(temp);
        }

        return result;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;

        for(int i = 0; i<numRows; i++) result.add(getPreviousRow(i));

        return result;
    }

    public static List<Integer> getPreviousRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        List<Integer> prevRow = new ArrayList<>();

        if(rowIndex == 0) return List.of(1);

        prevRow = getPreviousRow(rowIndex - 1);

        list.add(1);
        for(int i = 1; i< prevRow.size(); i++) list.add(prevRow.get(i) + prevRow.get(i-1));
        list.add(1);

        return list;
    }

    public static void main(String[] args) {


    }
}
