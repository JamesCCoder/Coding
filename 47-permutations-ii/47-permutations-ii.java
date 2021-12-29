class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 1) return res;
        Arrays.sort(nums);
        helper(res, new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> cur, int[] nums, boolean[] visited){
        if(cur.size() == nums.length){
            res.add(new ArrayList(cur));
            return;
        }
        
        for(int i = 0; i< nums.length; i++){
            if(visited[i]) continue;
            if(i>0 && nums[i] == nums[i-1] && !visited[i-1]) continue;
            cur.add(nums[i]);
            visited[i] = true;
            helper(res, cur, nums, visited);
            cur.remove(cur.size()-1);
            visited[i] = false;
        }
        
    }
}