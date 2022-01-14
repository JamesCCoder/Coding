class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0]+nums[1]+nums[2];
        for(int i = 0; i<nums.length; i++){
            int s = i+1;
            int e = nums.length - 1;
            while(s<e){
                int sum = nums[s] + nums[e] + nums[i];
                if(Math.abs(target - sum) < Math.abs(target - res)){
                    res = sum;
                }
                if(sum > target){
                    e--;
                }else if(sum < target){
                    s++;
                }else{
                    return res;
                }
            }
        }
        return res;
    }
}