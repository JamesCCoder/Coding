class Solution {
public int singleNumber(int[] nums) {

    int i = 0;
    int count = 0;

    Arrays.sort(nums);

    for (i = 0; i < nums.length -1; i++)
    {
        if(nums[i] == nums[i+1])
            count++;
        else
            count--;

        if (count < 0)
            return nums[i];
    }

    return nums[i];
    
}
}