class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        int[][] res = new int[m][n];
        res[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        

        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(obstacleGrid[i][j] != 1){
                    if(i > 0 && j > 0){
                        res[i][j] = res[i-1][j] + res[i][j-1];
                    }else if(i > 0){
                        res[i][j] = res[i-1][j];
                    }else if(j > 0){
                        res[i][j] = res[i][j-1];
                    }
                }
            }
        }
        return res[m-1][n-1];
    }
}