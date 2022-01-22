class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int l = 0, r = 0; r < nums.length; r++){
            while(l < r && nums[r] - nums[l] > 1){
                l++;
            }
            if(nums[r] - nums[l] == 1){
                res = Math.max(res, r - l + 1);
            }
        }
        return res;
    }
}