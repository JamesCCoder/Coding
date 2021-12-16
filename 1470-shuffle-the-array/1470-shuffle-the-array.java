class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m = nums.length;
        int[] result = new int[m];
        for(int i = 0; i<m/2; i++){
            result[2*i] =  nums[i];
            result[2*i+1] =nums[i+n];
        }
        return result;
    }
}