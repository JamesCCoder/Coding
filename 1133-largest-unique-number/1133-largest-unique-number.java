class Solution {
    public int largestUniqueNumber(int[] nums) {
        
        Map<Integer, Integer> res = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            res.put(nums[i], res.getOrDefault(nums[i], 0)+1);
        }
        int max = -1;
        int result;
        for(int j = 0; j<nums.length; j++){
            if(res.get(nums[j])==1){
                result = nums[j];
                if(result> max){max = result;}
            }
        }
        return max;
    }
}