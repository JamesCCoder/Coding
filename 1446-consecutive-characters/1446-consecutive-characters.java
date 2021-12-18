class Solution {
    public int maxPower(String s) {
        int n = 1;
        int res = Integer.MIN_VALUE;
        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                n++;
                if(n>res){res = n;}
            }else{
                n = 1;
            }
        }
        if(res<0){
            res = 1;
        }
        return res;
    }
}