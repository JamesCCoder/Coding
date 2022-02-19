class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int[] in = new int[candies.length];
        int sum = 0;
        
        for(int i = 0; i<candies.length; i++){
            in[i] = candies[i] + extraCandies;
        }
        
        for(int i = 0; i<candies.length; i++){
            for(int j = 0; j<candies.length; j++){
                if(in[i] >= candies[j]){
                    sum++;
                }
                
            }
             if(sum == candies.length){
                        res.add(true);
                    }else{
                        res.add(false);
                    }
            sum = 0;
        }
        return res;
    }
}