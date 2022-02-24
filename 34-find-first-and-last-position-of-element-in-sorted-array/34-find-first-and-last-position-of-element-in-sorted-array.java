class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        int l = search(nums, target - 0.5);
        int r = search(nums, target + 0.5);
        if(r - l == 0){
            return res;
        }
        res[0] = l;
        res[1] = r-1;
        return res;
    }
    
    public int search(int[] nums, double target){
        int l = 0;
        int r = nums.length - 1;
        while(l <= r){
            int m = (r - l)/2 + l;
            if(nums[m] == target){
                return m;
            }else if(target > nums[m]){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return l;
    }
}