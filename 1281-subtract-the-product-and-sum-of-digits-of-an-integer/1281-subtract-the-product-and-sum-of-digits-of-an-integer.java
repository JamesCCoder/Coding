class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int time = 1;
        int tmp = n;
        while(tmp != 0){
            int tmp1 = tmp % 10;
            time *= tmp1;
            sum += tmp1;
            tmp /= 10;
        }
        return time - sum;
    }
}