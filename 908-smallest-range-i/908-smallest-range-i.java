class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        if(nums[n-1]-nums[0]> k*2){
            return nums[n-1]-nums[0]- k*2;
        }else{
            return 0;
        }
    }
}