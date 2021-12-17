class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] numss = nums;
        int[] res = new int[nums.length];
        int n = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length; j++){
                if(numss[i]>nums[j]){
                    n++;
                }
            }
            res[i]=n;
            n=0;
        }
        return res;
        
    }
}