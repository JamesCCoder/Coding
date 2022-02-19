class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int sum = 0;
        for(int num: nums){
            if(num == target){
                sum++;
            }
        }
        return sum > nums.length/2;
    }
}