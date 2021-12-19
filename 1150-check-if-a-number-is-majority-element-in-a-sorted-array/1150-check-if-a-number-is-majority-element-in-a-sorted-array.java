class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int sum = 0;
        for(int i = 0;i<nums.length; i++){
            if(nums[i]==target){
                sum++;
            }
        }
        if(sum*2 > nums.length){
            return true;
        }else{
            return false;
        }
    }
}