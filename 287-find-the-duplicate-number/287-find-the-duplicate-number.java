class Solution {
    public int findDuplicate(int[] nums) {
        int left = 1;
        int right = nums.length;
        while(left < right){
            int mid = (right - left)/2 + left;
            int cnt = 0;
            for(int num : nums){
                if(num <= mid)cnt++;
            }
            if(cnt <= mid) left = mid+1;
            else right = mid;
                
            }
            
        
        return right;
    }
}