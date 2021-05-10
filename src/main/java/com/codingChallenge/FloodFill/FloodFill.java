package com.codingChallenge.FloodFill;

public class FloodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (newColor == image[sr][sc]) return image;
        floodFillHelper(image, sr, sc, newColor, image[sr][sc]);

        return image;
    }

    public static void floodFillHelper(int[][] image, int sr, int sc, int newColor, int originalColor) {
        if (sr < 0 || sr > image.length - 1 || sc < 0 || sc > image[0].length - 1 || originalColor != image[sr][sc])
            return;

        image[sr][sc] = newColor;

        floodFillHelper(image, sr - 1, sc, newColor, originalColor);
        floodFillHelper(image, sr + 1, sc, newColor, originalColor);
        floodFillHelper(image, sr, sc - 1, newColor, originalColor);
        floodFillHelper(image, sr, sc + 1, newColor, originalColor);
    }

    public static void main(String[] args) {

    }
}
