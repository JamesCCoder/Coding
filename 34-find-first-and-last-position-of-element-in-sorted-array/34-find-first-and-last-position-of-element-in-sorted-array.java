class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] res = new int[]{-1, -1};
        int left = binarySearch(nums, target - 0.5);
        int right = binarySearch(nums, target + 0.5);
        if(right - left == 0){
            return res;
        }
        res[0] = left;
        res[1] = right - 1;
        return res;
    }
    
    public int binarySearch(int[] nums, double target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (end - start)/2 + start;
            if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }
}