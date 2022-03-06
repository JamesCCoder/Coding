class Solution {
    public int balancedStringSplit(String s) {
        int a = 0;
        int b = 0;
        for(char c: s.toCharArray()){
            if(c == 'L'){
                a++;
            }else{
                a--;
            }
            if(a == 0){
                b++;
            }
        }
        return b;
    }
}