class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> res = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(res.contains(nums[i])) return true;
            res.add(nums[i]);
            if(res.size() > k){
                res.remove(nums[i-k]);
            }
        }
        return false;
    }
}