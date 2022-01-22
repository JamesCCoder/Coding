class Solution {
    public int subarraysWithKDistinct(int[] nums, int K) {

        int[] cacheArr = new int[nums.length + 1];
        int count = 0;
        int prefix = 0;
        int result = 0;
        for (int left = 0, right = 0; right < nums.length; ++right) {
 
            if (++cacheArr[nums[right]] == 1) {
                ++count;
            }

            if (count > K) {
                prefix = 0;
                cacheArr[nums[left++]]--;
                count--;
            }

            while (cacheArr[nums[left]] > 1) {
                cacheArr[nums[left++]]--;
                prefix++;
            }

            if (count == K) {
                result += prefix + 1;
            }
        }

        return result;

    }
}