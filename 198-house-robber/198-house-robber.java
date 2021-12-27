class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if(n == 0){
            return 0;
        }
        
        int robnext;
        int robnextplusone;
        
        robnextplusone = 0;
        robnext = nums[n-1];
        
        for(int i = n-2; i>=0; i--){
            int current = Math.max(robnext, robnextplusone + nums[i]);
            robnextplusone = robnext;
            robnext = current;
        }
        return robnext;
    }
}