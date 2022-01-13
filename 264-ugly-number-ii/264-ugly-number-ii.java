class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[1690];
        dp[0] = 1;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        
        for(int i = 1; i< 1690; i++){
            int tmp2 = 2 * dp[i2];
            int tmp3 = 3 * dp[i3];
            int tmp5 = 5 * dp[i5];
            
            dp[i] = tmp2;
            if(tmp3 < dp[i]){
                dp[i] = tmp3;
            }
            if(tmp5 < dp[i]){
                dp[i] = tmp5;
            }
            
            if(dp[i] == tmp2){
                i2++;
            }
            if(dp[i] == tmp3){
                i3++;
            }
            if(dp[i] == tmp5){
                i5++;
            }
        }
        return dp[n-1];
    }
}