class Solution {
    public int longestOnes(int[] nums, int K) {
        int i,j;
        for (i = 0, j = 0; j < nums.length; ++j) {
            if (nums[j] == 0) K--;
            if (K < 0 && nums[i++] == 0) K++;
        }
        return j - i;
    
    }
}
