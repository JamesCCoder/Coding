class Solution {
    public boolean isMonotonic(int[] nums) {
        int m = 0;
        int n = 0;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]-nums[i+1] <= 0){
                m++;
            }
        }
        
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]-nums[i+1] >= 0){
                n++;
            }
        }
        
        if((m == nums.length-1)||(n == nums.length-1)){
            return true;
        }else{
            return false;
        }
    }
}