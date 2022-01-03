class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for(int i = 1; i<nums.length; i++){
            int num = nums[i];
            sum = Math.max(num, sum+ num);
            max = Math.max(max, sum);
        }
        return max;
    }
}