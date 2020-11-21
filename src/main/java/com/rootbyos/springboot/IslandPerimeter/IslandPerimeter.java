package com.rootbyos.springboot.IslandPerimeter;

public class IslandPerimeter {
    public static void main(String[] args) {
    }

    public static int islandPerimeter(int[][] grid){

        int perimeter =0;

        for(int i =0; i<grid.length; i++){ //add total
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    perimeter +=4;
                }
            }
        }
        for (int i=0; i<grid.length; i++) { //Minus if nearby is an also island
            for (int j=0; j<grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    
                }
            }
        }
        return perimeter;
    }
}
