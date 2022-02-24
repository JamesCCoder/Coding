class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(new ArrayList<>(), candidates, target, 0);
        return res;
    }
    
    public void helper(List<Integer> cur, int[] candidates, int target, int index){
        if(target <= 0){
            if(target == 0){
                res.add(new ArrayList(cur));
            }
            return;
        }
        for(int i = index; i<candidates.length; i++){
            cur.add(candidates[i]);
            helper(cur, candidates, target - candidates[i], i);
            cur.remove(cur.size()-1);
        }
    }
}