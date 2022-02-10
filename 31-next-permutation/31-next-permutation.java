class Solution {
    public void nextPermutation(int[] nums) {
        int m = nums.length;
        for(int i = nums.length - 1; i>0; i--){
            if(nums[i] - nums[i-1] > 0){
                Arrays.sort(nums, i, m);
                for(int j = i; j<m; j++){
                    if(nums[j] - nums[i-1] > 0){
                        int temp = nums[j];
                        nums[j] = nums[i-1];
                        nums[i-1] = temp;
                        return;
                    }
                }
            }
        }
        Arrays.sort(nums);
        return;
    }
}