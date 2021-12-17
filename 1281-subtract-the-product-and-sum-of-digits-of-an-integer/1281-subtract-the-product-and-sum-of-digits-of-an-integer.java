class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int time = 1;
        while(n>0){
            
            time = time * (n % 10);
            sum = sum + (n % 10);
            n = n / 10;
            
        }
        return time - sum;
    }
}



