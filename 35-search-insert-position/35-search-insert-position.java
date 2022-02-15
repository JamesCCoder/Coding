class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            int m = (r - l)/2 + l;
            if(nums[m] == target){
                return m;
            }
            if(target < nums[m]){
                r = m - 1;
            }else{
                l = m + 1;
            }
        }
        return l;
    }
}