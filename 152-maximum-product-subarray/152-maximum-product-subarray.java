class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        
        for(int i = 1; i<nums.length; i++){
            int cur = nums[i];
            int tmp = Math.max(cur, Math.max(max * cur, min * cur));
            min = Math.min(cur, Math.min(max * cur, min * cur));
            max = tmp;
            res = Math.max(max, res);
        }
        return res;
    }
}