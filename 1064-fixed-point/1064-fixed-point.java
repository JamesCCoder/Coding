class Solution {
    public int fixedPoint(int[] arr) {
        int res = -1;
        
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == i){
                res = i;
                break;
            }
        }
        return res;
    }
}