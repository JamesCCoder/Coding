class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = 0;
        for(int i = nums.length - 1; i>=1; i--){
            if(nums[i] > nums[i-1]){
                n++;
                if(n == 2){
                    return nums[i-1];
                }
            }
        }
        return nums[nums.length - 1];
    }
}