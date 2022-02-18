class Solution {
    public int maxPower(String s) {
        int n = 1;
        int res = 1;
        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                n++;
                res = Math.max(res, n);
            }else{
                n = 1;
            }
        }
        return res;
    }
}