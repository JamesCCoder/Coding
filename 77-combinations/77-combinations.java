class Solution {
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        helper(n, k, 1, new ArrayList<>());
        return res;
    }
    
    public void helper(int n, int k, int start, List<Integer> list){
        if(k == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = start; i<= n - k + 1; i++){
            list.add(i);
            helper(n, k-1, i+1, list);
            list.remove(list.size()-1);
        }
    }
}