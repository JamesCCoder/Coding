class Solution {
  private int[][] grid;
  private int[][][] memo; 
    
  public int cherryPickup(int[][] grid) {
    this.grid = grid;
    int m = grid.length;
    int n = grid[0].length;
    memo = new int[m][n][m];
    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j)
        Arrays.fill(memo[i][j], Integer.MIN_VALUE);
    return Math.max(0, dp(m - 1, n - 1, m - 1));
  }
  
  private int dp(int x1, int y1, int x2) {
    final int y2 = x1 + y1 - x2;
    if (x1 < 0 || y1 < 0 || x2 < 0 || y2 < 0) return -1;
    if (grid[x1][y1] < 0 || grid[x2][y2] < 0) return -1;
    if (x1 == 0 && y1 == 0) return grid[x1][y1];
    if (memo[x1][y1][x2] != Integer.MIN_VALUE) return memo[x1][y1][x2];
    memo[x1][y1][x2] = Math.max(Math.max(dp(x1 - 1, y1, x2 - 1), dp(x1, y1 - 1, x2)),
                                Math.max(dp(x1, y1 - 1, x2 - 1), dp(x1 - 1, y1, x2)));
    
    if (memo[x1][y1][x2] >= 0) {
      memo[x1][y1][x2] += grid[x1][y1];
      if (x1 != x2) memo[x1][y1][x2] += grid[x2][y2];
    }
    
    return memo[x1][y1][x2];
  }
}
