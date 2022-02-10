class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int m = (e-s)/2+s;
            if(nums[m]==target){
                return m;
            }
            if(nums[s]<=nums[m]){
                if(target>=nums[s] && target< nums[m]){
                    e = m -1;
                }else{
                    s = m +1;
                }
            }
            
            if(nums[m]<=nums[e]){
                if(target > nums[m] && target <= nums[e]){
                    s = m +1;
                }else{
                    e = m -1;
                }
            }
            
        }
        return -1;
    }
}