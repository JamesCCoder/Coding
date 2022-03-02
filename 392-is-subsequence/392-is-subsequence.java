class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        
        int idxs = 0;
        int idxt = 0;
        
        while(idxt < t.length()){
            if(s.charAt(idxs) == t.charAt(idxt)){
                idxs++;
                if(idxs == s.length()) return true;
            }
            idxt++;
        }
        return false;
    }
}