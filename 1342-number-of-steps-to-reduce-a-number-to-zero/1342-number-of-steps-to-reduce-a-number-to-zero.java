class Solution {
    public int numberOfSteps(int num) {
        int sum = 0;
        while(num != 0){
            if(num % 2 == 0){
            num = even(num);
            sum ++;
        }else{
            num = odd(num);
            sum ++;
        }
        }
        return sum;
    }
    
    public int odd(int n){
        n = n -1;
        return n;
    }
    
    public int even(int m){
        m = m/2;
        return m;
    }
}