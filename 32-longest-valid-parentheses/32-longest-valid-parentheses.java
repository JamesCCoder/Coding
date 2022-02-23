class Solution {
    public int longestValidParentheses(String s) {
        int l = 0;
        int r = 0;
        int max = 0;
        
        for(char c: s.toCharArray()){
            if(c == '('){
                l++;
            }else{
                r++;
            }
            
            if(l == r){
                max = Math.max(max, r * 2);
            }else if(r > l){
                l = 0;
                r = 0;
            }
        }
        
        l = 0;
        r = 0;
        
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i) == ')'){
                r++;
            }else{
                l++;
            }
            
            if(l == r){
                max = Math.max(max, l * 2);
            }else if(l > r){
                l = 0;
                r = 0;
            }
        }
               return max;
    }
}