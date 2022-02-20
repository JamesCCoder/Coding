class Solution {
    public boolean isArmstrong(int n) {
        int m = Integer.toString(n).length();
        int res = 0;
        int tmp = n;
        while(tmp != 0){
            res += Math.pow(tmp % 10,m);
            tmp /= 10;
        }
        return res == n;
    }
}