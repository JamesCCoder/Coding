class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> r = new HashMap<>();
        int res= 0;
        for(int i = 0, j = 0; i<s.length(); i++){
            if(r.containsKey(s.charAt(i))){
                j = Math.max(j, r.get(s.charAt(i))+1);
            }
            r.put(s.charAt(i), i);
            res = Math.max(res, i-j+1);
        }
        return res;
    }
}