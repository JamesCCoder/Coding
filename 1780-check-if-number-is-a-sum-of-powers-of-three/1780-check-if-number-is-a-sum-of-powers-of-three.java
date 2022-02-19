class Solution {
    public boolean checkPowersOfThree(int n) {
        if(n <= 0) return false;
        while(n > 0){
            if(n % 3 == 2){
                return false;
            }
            n /= 3;
        }
        return true;
    }
}