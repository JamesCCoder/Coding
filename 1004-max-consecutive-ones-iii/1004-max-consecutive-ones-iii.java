class Solution {
    public int longestOnes(int[] nums, int K) {
        int l,r;
        for (l = 0, r = 0; r < nums.length; r++) {
            if (nums[r] == 0) K--;
            if (K < 0 && nums[l++] == 0) K++;
        }
        return r - l;
    
    }
}
