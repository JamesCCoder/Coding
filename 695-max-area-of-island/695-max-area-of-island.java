class Solution {
     public int maxAreaOfIsland(int[][] grid) {
          int res = 0;
          for(int i = 0; i<grid.length; i++){
              for(int j = 0; j<grid[0].length; j++){
                  if(grid[i][j] == 1){
                      res = Math.max(res, findMaxArea(grid, i, j));
                  }
              }
         }
         
         return res;
     }
     
    private int findMaxArea(int [][] grid, int i, int j){
         int area = 0;
        if(i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]==1){
             grid[i][j] = 0;
             area = 1 + findMaxArea(grid,i-1,j) + findMaxArea(grid,i+1,j) + findMaxArea(grid,i,j-1) + findMaxArea(grid,i,j+1);
         }
         return area;
     }
}