class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        
        helper(n,n,"");
        return res;
    }
    
    public void helper(int left, int right, String cur){
        if(left < 0 || right < 0|| left > right) return;
        if(left == 0 && right == 0){
            res.add(cur);
            return;
        }
        helper(left - 1, right, cur + "(");
        helper(left, right - 1, cur + ")");
    }
}