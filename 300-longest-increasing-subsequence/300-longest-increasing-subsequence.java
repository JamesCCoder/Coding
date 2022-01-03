class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        
        int maxLen = 0;
        for(int i =0; i<n; i++){
            int len = 1;
            for(int j = 0; j<i; j++){
                if(nums[j]<nums[i]){
                    len = Math.max(len, dp[j]+1);
                }
            }
            
            dp[i] = len;
            if(dp[i] > maxLen){
                maxLen = dp[i];
            }
        }
        return maxLen;
    }
}