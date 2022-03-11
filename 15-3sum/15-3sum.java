class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            
            int l = i + 1;
            int r = nums.length - 1;
            int target = 0 - nums[i];
            
            while(l < r){
                int sum = nums[l] + nums[r];
                if(sum == target){
                    res.add(Arrays.asList(new Integer[]{nums[l], nums[r], nums[i]}));
                    while(l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                    r--;
                    while(l < r && nums[r] == nums[r+1]){
                        r--;
                    }
                }else if(sum < target){
                    l++;
                }else{
                    r--;
                }
                
            }
        }
        return res;
    }
}