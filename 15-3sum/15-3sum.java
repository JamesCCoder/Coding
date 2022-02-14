class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i] == nums[i-1]) continue;
            
            int target = 0 - nums[i];
            int s = i+1;
            int l = nums.length-1;
            
            while(s<l){
                int tmp = nums[s] + nums[l];
                if(tmp == target){
                    res.add(Arrays.asList(new Integer[]{nums[i], nums[s], nums[l]}));
                    while(s<l && nums[s] == nums[s-1]){
                        s++;
                    }
                    l--;
                    while(s<l && nums[l] == nums[l+1]){
                        l--;
                    }
                }else if(tmp < target){
                    s++;
                }else{
                    l--;
                }
            }
        }
        return res;
    }
}