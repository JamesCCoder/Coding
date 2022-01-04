class Solution {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        int res[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            nums[i] = a* nums[i] * nums[i]  + b * nums[i]  + c;
            res[i] = nums[i];
        }
        Arrays.sort(res);
        return res;
    }
}