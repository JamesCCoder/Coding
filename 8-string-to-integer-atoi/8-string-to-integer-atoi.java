class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s == null || s.length() == 0) return 0;
        
        int sign = 1;
        int index = 0;
        if(s.charAt(0) == '+'){
            sign = 1;
            index++;
        }
        if(s.charAt(0) == '-'){
            sign = -1;
            index++;
        }
        
        long res = 0;
        for(int i = index; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                return (int)res * sign;
            }
            res = res * 10 + s.charAt(i) - '0';
            if(sign == 1 && res > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && sign * res < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return (int)res*sign;
    }
}