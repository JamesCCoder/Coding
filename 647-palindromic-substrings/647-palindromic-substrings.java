class Solution {
    public int countSubstrings(String s) {
        if(s.isEmpty()) return 0;
        int n = s.length();
        int res = 0;
        for(int i=0; i<n; i++){
            res += helper(s, i, i);
            res += helper(s, i, i+1);
        }
        return res;
    }
    
    public int helper(String s, int i, int j){
        int res = 0;
        while(i>=0 && j< s.length()){
            if(s.charAt(i) != s.charAt(j)) break;
            i--;
            j++;
            res++;
        }
        return res;
    }
}