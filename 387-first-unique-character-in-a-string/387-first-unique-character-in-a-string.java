class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> r = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            r.put(c, r.getOrDefault(c, 0)+1);
        }
        
        
        for(int i = 0; i<s.length(); i++){
            if(r.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}