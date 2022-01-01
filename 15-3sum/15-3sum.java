class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        
        for(int i = 0; i<n; i++){
            if(nums[i] > 0) break;
            if(i>0 && nums[i] == nums[i-1]) continue;
            
            int target = 0 - nums[i];
            
            int low = i + 1; 
            int high = n - 1;
            
            while(low < high){
                int tmpsum = nums[low] + nums[high];
                if(tmpsum == target){
                    res.add(Arrays.asList(new Integer[]{nums[i], nums[low], nums[high]}));
                    low++;
                    while(low < high && nums[low] == nums[low - 1]){
                        low ++;
                        
                    }
                    high --;
                    while(low < high && nums[high] == nums[high + 1]){
                        high --;
                    }
                }else if(tmpsum < target){
                    low ++;
                }else{
                    high --;
                }
            }
        }
        return res;
    }
}