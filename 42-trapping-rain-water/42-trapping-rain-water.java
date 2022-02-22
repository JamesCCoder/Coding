class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        int res = 0;
        
        while(l<r){
            int lower = height[height[l]<height[r]? l++ : r--];
            max = Math.max(max, lower);
            res += max - lower;
        }
        return res;
    }
}