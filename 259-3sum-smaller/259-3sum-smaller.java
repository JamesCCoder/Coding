class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        int res = 0;
        Arrays.sort(nums);
        
        for(int i = 0; i<nums.length - 2; i++){
            int l = i+ 1;
            int r = nums.length - 1;
            while(l < r){
                if(nums[i] + nums[l] + nums[r] < target){
                    res += r - l;
                    l++;
                }else{
                    r--;
                }
            }
        }
        return res;
    }
}