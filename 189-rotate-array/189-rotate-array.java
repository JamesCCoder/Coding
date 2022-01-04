class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
    // 翻转前半部分
        int l=0,r=nums.length-k-1;
        reverse(nums,l,r);
    // 翻转后半部分
        l=nums.length-k;
        r=nums.length-1;
        reverse(nums,l,r);
    // 整体翻转
         l=0;
         r=nums.length-1;
        reverse(nums,l,r);
    }
    
    public void reverse(int[]nums, int l, int r){
        while(l < r){
            nums[l] = nums[l]^nums[r];
            nums[r] = nums[l]^nums[r];
            nums[l] = nums[l]^nums[r];
            l++;
            r--;
        }
    }
}