class Solution {
    public int removeDuplicates(int[] nums) {
        int res = 0;
        for(int num: nums){
            if(res<1 || num>nums[res-1]){
                nums[res++] = num;
            }
        }
        return res;
    }
}