package com.codingChallenge.PrisonAfterNDays;

public class PrisonAfterNDays {

    public static int[] prisonAfterNDays(int[] cells, int n) {
        int checkRepeat = n % 14 == 0 ? 14 : n % 14;

        for (int i = 0; i < checkRepeat; i++) {
            cells = helper(cells);
        }

        return cells;
    }

    public static int[] helper(int[] cells) {
        int[] temp = new int[cells.length];

        for (int i = 1; i < cells.length - 1; i++) {
            temp[i] = cells[i - 1] == cells[i + 1] ? 1 : 0;
        }

        return temp;
    }

    public static void main(String[] args) {

    }
}
