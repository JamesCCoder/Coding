class Solution {
    public boolean isArmstrong(int n) {
        int m = Integer.toString(n).length();
        int tmp = n;
        int sum = 0;
        while(tmp != 0){
            int tmp1 = tmp % 10;
            sum += Math.pow(tmp1, m);
            tmp /= 10;
        }
        return sum == n;
    }
}