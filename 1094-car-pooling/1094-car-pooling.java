class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] in = new int[1001];
        for(int[] trip: trips){
            in[trip[1]] += trip[0];
            in[trip[2]] -= trip[0];
        }
        
        int res = 0;
        for(int num: in){
            res += num;
            if(res > capacity){
                return false;
            }
        }
        return true;
    }
}