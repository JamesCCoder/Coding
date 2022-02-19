class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        boolean res = false;
        for(int i = 0; i<= arr.length-3; i++){
            if((isOdd(arr[i])==true)&&(isOdd(arr[i+1])==true)&&(isOdd(arr[i+2])==true)){
                res = true;
                break;
            }
        }
        return res;
    }
    
    public boolean isOdd(int m){
         if((m % 2)!=0){
            return true;
        }else{
            return false;
        }
    }
}