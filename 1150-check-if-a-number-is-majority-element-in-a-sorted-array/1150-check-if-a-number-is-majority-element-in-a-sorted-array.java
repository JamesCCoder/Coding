class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int res = 0;
        int n = nums.length / 2;
        for(int num : nums){
            if(num == target){
                res++;
                if(res > n) return true;
            }
        }
        return false;
    }
}