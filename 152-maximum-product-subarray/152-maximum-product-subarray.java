class Solution {
    public int maxProduct(int[] nums) {
        int res= nums[0];
        int max = nums[0];
        int min = nums[0];
        
        for(int i = 1; i<nums.length; i++){
            int cur = nums[i];
            int tmp = Math.max(cur, Math.max(cur * max, cur * min));
            min = Math.min(cur, Math.min(cur * max, cur * min));
            max = tmp;
            res = Math.max(res, max);
        }
        return res;
    }
}