class Solution {
    public int majorityElement(int[] nums) {
        
        int res = nums[0];
        int count = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]==res){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                count = 1;
                res = nums[i];
            }
        }
        return res;
    }
}