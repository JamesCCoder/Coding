class Solution {
    public boolean isArmstrong(int n) {
        String s = Integer.toString(n);
        int len = s.length();
        int sum = 0;
        int x = n;
        
        while(n != 0){
            int m = n % 10;
            sum += Math.pow(m, len);
            n = n / 10;
        }
        return sum == x;
    }
}

