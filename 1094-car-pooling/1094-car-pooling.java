class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] res = new int[1001];
        for(int[] trip : trips){
            res[trip[1]] += trip[0];
            res[trip[2]] -= trip[0];
        }
        
        int usedCapacity = 0;
        for(int number : res){
            usedCapacity += number;
            if(usedCapacity > capacity){
                return false;
            }
        }
        return true;
    }
}