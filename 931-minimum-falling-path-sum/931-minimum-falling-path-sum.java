class Solution {
    public int minFallingPathSum(int[][] matrix) {
        if(matrix.length == 1) return matrix[0][0];
        int n = matrix.length;
        int res = Integer.MAX_VALUE;
        for(int i = 1; i<n;i++){
            for(int j = 0; j<n; j++){
                int pre = matrix[i-1][j];
                if(j > 0){
                    pre = Math.min(pre, matrix[i-1][j-1]);
                }
                if(j < n - 1){
                    pre = Math.min(pre, matrix[i-1][j+1]);
                }
                matrix[i][j] += pre;
                if(i == n - 1){
                    res = Math.min(res, matrix[i][j]);
                }
            }
        }
        return res;
    }
}