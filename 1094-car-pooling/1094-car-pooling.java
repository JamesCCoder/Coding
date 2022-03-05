class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] cal = new int[1001];
        
        for(int[] trip: trips){
            cal[trip[1]] += trip[0];
            cal[trip[2]] -= trip[0];
        }
        
        int sum = 0;
        for(int in: cal){
            sum += in;
            if(sum > capacity){
                return false;
            }
        }
        return true;
    }
}