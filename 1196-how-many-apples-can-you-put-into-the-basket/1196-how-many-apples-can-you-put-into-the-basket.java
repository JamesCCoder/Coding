class Solution {
    public int maxNumberOfApples(int[] weight) {
        Arrays.sort(weight);
        int res = 0;
        int sum = 0;
        for(int i = 0; i<weight.length; i++){
            sum += weight[i];
            if(sum <= 5000){
                res ++;
            }else{
                break;
            }
        }
        return res;
        
    }
}