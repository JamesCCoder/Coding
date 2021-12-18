class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1){
            return stones[0];
        }
        int n =  stones.length;
        int res = -1;
        for(int i = 0; i<stones.length; i++){
            Arrays.sort(stones);
            if(stones[n-2]==0){
               res = stones[n-1];
                break;
                }
            stones[n-1] = stones[n-1] - stones[n-2]; 
            stones[n-2] = 0;
        }
        return res;
    }
}