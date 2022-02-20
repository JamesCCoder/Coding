class Solution {
    public int sumOfDigits(int[] nums) {
        Arrays.sort(nums);
        int x = nums[0];
        
        int res = 0;
        
        while(x != 0){
            res += x % 10;
            x /= 10;
            
        }
        return res % 2 == 0 ? 1 : 0;
    }
}