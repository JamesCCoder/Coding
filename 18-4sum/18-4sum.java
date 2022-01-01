class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        
        for(int i = 0; i<n; i++){
           
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j<n; j++){
             
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                
                int l = j+1;
                int h = n-1;
                
                while(l<h){
                    int tmp = nums[i] + nums[j] + nums[l] + nums[h];
                    if(tmp == target){
                        res.add(Arrays.asList(new Integer[]{nums[i], nums[j], nums[l], nums[h]}));
                        l++;
                        while(l<h && nums[l] == nums[l-1]){
                            l++;
                        }
                        h--;
                        while(l<h && nums[h] == nums[h+1]){
                            h--;
                        }
                    }else if(tmp < target){
                        l++;
                    }else{
                        h--;
                    }
                }
            }
        }
        return res;
    }
}