class Solution {
    public boolean judgeCircle(String moves) {
        int n = 0;
        int m = 0;
        for(int i = 0; i<moves.length(); i++){
            if(moves.charAt(i) == 'R'){
                n++;
            }
            if(moves.charAt(i) == 'L'){
                n--;
            }
            if(moves.charAt(i)== 'U'){
                m++;
            }
            if(moves.charAt(i) == 'D'){
                m--;
            }
        }
        if(m == 0 & n ==0){
            return true;
        }else{
            return false;
        }
    }
}