class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int index = 0;
        while(index<=end){
            if(nums[index]==0) swap(nums, start++, index++);
            else if(nums[index]==1) index++;
            else if(nums[index]==2) swap(nums, index, end--);
        }
    }
    
    public void swap(int[]nums, int i, int j){
        int temp = nums[i]; 
        nums[i] =nums[j];
        nums[j] = temp;
    }
}