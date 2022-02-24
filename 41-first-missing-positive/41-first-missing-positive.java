class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] <= 0 || nums[i] == res){
                continue;
            }else if(nums[i] > res + 1){
                break;
            }
            res++;
        }
        return res + 1;
    }
}