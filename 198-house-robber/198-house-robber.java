class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        
        int robn;
        int robnn;
        
        robnn = 0;
        robn = nums[n-1];
        
        for(int i = n-2; i>=0;i--){
            int current = Math.max(robn, robnn + nums[i]);
            robnn = robn;
            robn = current;
        }
        return robn;
    }
}