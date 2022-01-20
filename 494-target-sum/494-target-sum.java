class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0, 0);
    }
    
    public int helper(int[] nums, int target, int u, int cur){
        if(u == nums.length){
            return cur == target ? 1 : 0;
        }
        
        int left = helper(nums, target, u + 1, cur + nums[u]);
        int right = helper(nums, target, u + 1, cur - nums[u]);
        return left + right;
    }
}