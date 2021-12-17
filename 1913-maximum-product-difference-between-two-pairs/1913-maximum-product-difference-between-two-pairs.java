class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int res = nums[0]*nums[1]-nums[nums.length-1]*nums[nums.length-2];
        return Math.abs(res);
    }
}