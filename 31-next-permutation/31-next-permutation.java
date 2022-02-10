class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        for(int i = nums.length - 1; i>0; i--){
             if(nums[i] - nums[i-1] > 0){
                 Arrays.sort(nums, i, n);
             }
             for(int j = i; j< nums.length; j++){
                 if(nums[j] - nums[i-1] > 0){
                     int tmp = nums[j];
                     nums[j] = nums[i-1];
                     nums[i-1] = tmp;
                     return;
                 }
             }
         }
        Arrays.sort(nums);
        return;
    }
}