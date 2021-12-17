class Solution {
    public int balancedStringSplit(String s) {
        int sum = 0;
        int res = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='L'){
                sum ++;
            }else{
                sum --;
            }
            if(sum == 0){
                res ++;
            }
        }
        return res;
    }
}