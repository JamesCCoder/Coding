class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] res = new boolean[s.length() + 1];
        res[0] = true;
        
        for(int j = 1; j<= s.length(); j++){
            for(int i = 0; i<=j; i++){
                if(wordDict.contains(s.substring(i, j)) && res[i]){
                    res[j] = true;
                }
            }
        }
        return res[s.length()];
    }
}