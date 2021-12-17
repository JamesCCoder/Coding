class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int[] candiess = new int[candies.length];
        for(int i =0;i<candies.length; i++){
            candiess[i] = candies[i]+extraCandies;
            
        }
        int n = 0;
        for(int j = 0; j<candies.length; j++){
            for(int k = 0; k<candies.length; k++){
               if(candiess[j]>=candies[k]){
                   n++;
               } 
            }
            if(n==candies.length){
                res.add(true);
                n=0;
            }else{
                res.add(false);
                n=0;
            }
        }
        return res;
        
    }
}