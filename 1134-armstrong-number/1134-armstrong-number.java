class Solution {
    public boolean isArmstrong(int n) {
        String s = Integer.toString(n);
        int m = s.length();
        
        int tmp = n;
        int res = 0;
        
        while(tmp != 0){
            res += Math.pow(tmp % 10, m);
            tmp /= 10;
        }
        
        return res == n;
    }
}