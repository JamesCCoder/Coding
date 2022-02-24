class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int res = 0;
        int high = 0;
        
        while(l < r){
            int low = height[height[l] < height[r] ? l++ : r--];
            high = Math.max(high, low);
            res += high - low;
        }
        return res;
    }
}