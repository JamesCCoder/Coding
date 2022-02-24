class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(new ArrayList<>(), candidates, target, 0);
        return res;
    }
    
    public void helper(List<Integer> cur, int[] candidates, int target, int index){
        if(target<= 0){
            if(target == 0){
                res.add(new ArrayList<>(cur));
            }
            return;
        }
        
        for(int i = index; i<candidates.length; i++){
            if(i > index && candidates[i] == candidates[i-1]) continue;
            cur.add(candidates[i]);
            helper(cur, candidates, target - candidates[i], i + 1);
            cur.remove(cur.size()-1);
        }
    }
}