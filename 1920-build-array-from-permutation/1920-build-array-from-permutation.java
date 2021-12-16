class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int numss[] = new int[n];
        for(int i =0; i<n; i++){
            numss[i]=nums[nums[i]];
        }
        return numss;
    }
}