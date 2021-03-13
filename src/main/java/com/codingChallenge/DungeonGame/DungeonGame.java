package com.codingChallenge.DungeonGame;

public class DungeonGame {

    public static int calculateMinimumHP(int[][] dungeon) {
        int col = dungeon.length;
        int row = dungeon[0].length;

        int[][] dp = new int[col][row];
        dp[col - 1][row - 1] = dungeon[col - 1][row - 1] < 0 ? Math.abs(dungeon[col - 1][row - 1]) + 1 : 1;

        for (int i = col - 2; i >= 0; i--) {
            int value = dp[i + 1][row - 1] - dungeon[i][row - 1];
            dp[i][row - 1] = Math.max(value, 1);
        }

        for (int i = row - 2; i >= 0; i--) {
            int value = dp[col - 1][i + 1] - dungeon[col - 1][i];
            dp[col - 1][i] = Math.max(value, 1);
        }

        for (int i = col - 2; i >= 0; i--) {
            for (int j = row - 2; j >= 0; j--) {
                dp[i][j] = Math.min(Math.max(dp[i][j + 1] - dungeon[i][j], 1), Math.max(dp[i + 1][j] - dungeon[i][j], 1));
            }
        }

        return dp[0][0];
    }

    //         int col = dungeon.length;
//         int row = dungeon[0].length;
//         int[][] dp = new int[col][row];
//         dp[0][0] = dungeon[0][0];
//         int i = 1;
//         int j = 1;
//         while((i < col) && (j < row)){
//             if(dungeon[i-1][j] > dungeon[i][j-1]){
//                 dp[i-1][j] = dp[i-1][j-1] + dungeon[i-1][j];
//                 j++;
//             } else if(dungeon[i-1][j] < dungeon[i][j-1]) {
//                 dp[i][j-1] = dp[i-1][j-1] + dungeon[i][j-1];
//                 i++;
//             }
//         }
//         if(i < col && j == row){
//             while(i<col){
//                 dp[i][j-1] = dp[i-1][j-1] + dungeon[i][j-1];
//                 i++;
//             }
//         }
//         if(i == col && j < row){
//             while(j < row){
//                 dp[i-1][j] = dp[i-1][j-1] + dungeon[i-1][j];
//                 j++;
//             }
//         }
//         System.out.println(Arrays.deepToString(dp));
//         int negative = 0 ;
//         int positive = 0;
//         // List<Integer> negative = new ArrayList<>();
//         // List<Integer> positive = new ArrayList<>();
//         for(int x = 0; x<col; x++){
//             for(int y = 0; y<row; y++){
//                 if(dp[x][y] <= 0){
//                     // negative.add(dungeon[x][y]);
//                     negative += dungeon[x][y];
//                 } else{
//                     // positive.add(dungeon[x][y]);
//                     positive += dungeon[x][y];
//                 }
//             }
//         }
//         System.out.println(negative);
//         System.out.println(positive);
//         if(positive > negative) return Math.abs(negative) + 1;
//         // return !negative ? 1 : Math.abs(dp[col-1][row-1]) +1;
//         // if(negative.isEmpty()) return 1;
//         return Math.abs(dp[col-1][row-1]) + 1;
    public static void main(String[] args) {

    }
}
