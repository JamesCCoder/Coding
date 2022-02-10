
class Solution {
    
     List<List<Integer>> res = new ArrayList<>();
     public List<List<Integer>> permute(int[] nums) {
        
     
        helper(new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }
    
    public void helper(List<Integer> cur, int[] nums, boolean[] visited){
        if(cur.size() == nums.length){
            res.add(new ArrayList(cur));
        }
        
        for(int i = 0; i<nums.length; i++){
            if(visited[i]) continue;
            cur.add(nums[i]);
            visited[i] = true;
            helper(cur, nums, visited);
            cur.remove(cur.size()-1);
            visited[i] = false;
        }
    }
}