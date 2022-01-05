class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if(s.length() == 0) return res;
        helper(res, new ArrayList<>(), s, 0);
        return res;
    }
    
    public void helper(List<List<String>> res, List<String> cur, String s, int low){
        if(low == s.length()){
            res.add(new ArrayList(cur));
            return;
        }
        
        int n = s.length();
        for(int high = low; high < n; high ++){
            if(isPal(s, low, high)){
                cur.add(s.substring(low, high + 1));
                helper(res, cur, s, high + 1);
                cur.remove(cur.size()-1);
            }
        }
    }
    
    public boolean isPal(String s, int low, int high){
        while(low <= high){
            if(s.charAt(low) != s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
}