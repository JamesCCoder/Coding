class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        int l = search(nums, target - 0.5);
        int r = search(nums, target + 0.5);
        if(r - l == 0){
            return res;
        }
        res[0] = l;
        res[1] = r - 1;
        return res;
    }
    
    public int search(int[] nums, double target){
        int s = 0;
        int e = nums.length - 1;
        while(s <= e){
            int m = (e - s)/2 + s;
            if(target >= nums[m]){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return s;
    }
}