class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int l = 0;
        int s = height.length - 1;
        while(l<s){
            res = Math.max(res, Math.min(height[l], height[s])* (s - l));
            if(height[l]<height[s]){
            l++;
        }else{
            s--;
        }
        
    }
        return res;
}
}