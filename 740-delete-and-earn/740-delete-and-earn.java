class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] res = new int[10001];
        for(int num: nums){
            res[num] += num;
        }
        
        for(int i = 2; i<10001; i++){
            res[i] = Math.max(res[i-1], res[i-2] + res[i]);
        }
        return res[10000];
    }
}