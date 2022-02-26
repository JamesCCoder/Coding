class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        int[][] res = new int[m+1][n+1];
        
        for(int i = 0; i<= m; i++){
            Arrays.fill(res[i], Integer.MAX_VALUE);
            res[i][0] = i;
        }
        
        for(int j = 0; j<=n; j++){
            res[0][j] = j;
        }
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                char c1 = word1.charAt(i);
                char c2 = word2.charAt(j);
                
                if(c1 == c2){
                    res[i+1][j+1] = res[i][j];
                }else{
                    res[i+1][j+1] = Math.min(Math.min(res[i+1][j], res[i][j+1]), res[i][j]) + 1;
                }
            }
        }
        return res[m][n];
    }
}