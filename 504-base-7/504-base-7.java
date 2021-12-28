class Solution {
    public String convertToBase7(int num) {
        int base = 7;
        int res = 0;
        int p = 1;
        while(num != 0){
            int rem = num % base;
            num = num / base;
            res = res + rem * p;
            p = p * 10;
        }
        
        return Integer.toString(res);
    }
}


