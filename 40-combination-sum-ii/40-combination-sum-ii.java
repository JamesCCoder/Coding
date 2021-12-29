class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> tmp, int[] candidates, int target, int index){
        if(target <= 0){
            if(target == 0){
                res.add(new ArrayList(tmp));
            }
            return;
        }
        
        for(int i = index; i<candidates.length; i++){
            if(i > index && candidates[i] == candidates[i-1]) continue;
            tmp.add(candidates[i]);
            helper(res, tmp, candidates, target-candidates[i], i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}