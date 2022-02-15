class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        
        for(int i = 0; i<nums.length; i++){
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r){
                int tmp = nums[l] + nums[r] + nums[i];
                if(Math.abs(target - tmp) < Math.abs(target - res)){
                    res = tmp;
                }
                if(tmp > target){
                    r--;
                }else if(tmp < target){
                    l++;
                }else{
                    return res;
                }
            }
        }
        return res;
    }
}