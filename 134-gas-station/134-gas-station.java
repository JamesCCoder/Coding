class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int m = gas.length;
        
        int total = 0;
        int cur = 0;
        int res = 0;
        
        for(int i = 0; i<m; i++){
            total += gas[i] - cost[i];
            cur += gas[i] - cost[i];
            if(cur < 0){
                res = i + 1;
                cur = 0;
            }
        }
        return total >= 0? res : -1;
    }
}