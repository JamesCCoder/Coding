class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m * n){
            return new int[][]{};
        }
        
        
        int[][] res = new int[m][n];
        int x = 0;
        int y = 0;
        
        for(int i = 0; i< original.length; i++){
            res[x][y] = original[i];
            y=(y+1)%n;
            if(y==0)
                x++;
            }
        
        return res;
    }
}

