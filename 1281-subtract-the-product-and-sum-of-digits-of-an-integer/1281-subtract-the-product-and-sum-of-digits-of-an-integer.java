class Solution {
    public int subtractProductAndSum(int n) {
        int time = 1;
        int sum = 0;
        int tmp = n;
        while(tmp != 0){
            time *= tmp % 10;
            sum += tmp % 10;
            tmp /= 10;
        }
        return time - sum;
    }
}