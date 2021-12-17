class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for(int i = 0; i< nums.length; i++){
            if((result(nums[i]) % 2) == 0){
                res++;
            }
        }
        return res;
    }
    
    public int result(int m){
        int sum = 0;
        while(m>=1){
            m = m / 10;
            sum ++;
        }
        return sum;
    }
}