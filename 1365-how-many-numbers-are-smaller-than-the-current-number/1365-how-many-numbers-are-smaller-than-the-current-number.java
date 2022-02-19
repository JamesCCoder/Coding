class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    sum++;
                }
            }
            res[i] = sum;
            sum = 0;
        }
        return res;
    }
}