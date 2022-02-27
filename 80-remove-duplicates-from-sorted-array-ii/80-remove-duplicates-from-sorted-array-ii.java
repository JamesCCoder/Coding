class Solution {
    public int removeDuplicates(int[] nums) {
        int res = 0;
        for(int num: nums){
            if(res < 2 || num > nums[res-2]){
                nums[res] = num;
                res++;
            }
        }
        return res;
    }
}