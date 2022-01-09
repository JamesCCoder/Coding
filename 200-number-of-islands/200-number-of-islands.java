class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid == null) return 0;
        int m = grid.length;
        int n = grid[0].length;
        
        int res = 0;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == '1'){
                    res++;
                    helper(grid, i, j);
                }
            }
        }
        return res;
    }
    
    public void helper(char[][] grid, int x, int y){
        if(x<0 || x>= grid.length || y<0 || y>= grid[0].length || grid[x][y] != '1') return;
        grid[x][y] = '*';
        helper(grid, x+1, y);
        helper(grid, x-1, y);
        helper(grid, x, y+1);
        helper(grid, x, y-1);
    }
}