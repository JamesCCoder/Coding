class Solution {
    public void sortColors(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int i = 0;
        while(i <= e){
            if(nums[i] == 0) swap(nums, s++, i++);
            else if(nums[i] == 1) i++;
            else if(nums[i] == 2) swap(nums, i, e--);
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}