class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] res = new int[n+1];
        for(int i = 2; i<n+1; i++){
            res[i] = Math.min(cost[i-2]+res[i-2], cost[i-1]+ res[i-1]);
        }
        return res[n];
    }
}