class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] sums = new int[10001];
        for(int num : nums){
            sums[num] += num;
        }
        for(int i = 2; i<10001; i++){
            sums[i] = Math.max(sums[i-1], sums[i-2] + sums[i]);
        }
        return sums[10000];
    }
}