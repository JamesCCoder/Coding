class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        int r = 1;
        int res = 0;
        while(l < nums.length && r < nums.length){
            if(l == r || nums[r] - nums[l] < k){
                r++;
            }else if(nums[r] - nums[l] > k){
                l++;
            }else{
                l++;
                res++;
                while(l < nums.length && nums[l] == nums[l-1]){
                    l++;
                }
            }
        }
        return res;
    }
}