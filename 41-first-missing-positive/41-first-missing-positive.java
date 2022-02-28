class Solution {
    public int firstMissingPositive(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        
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