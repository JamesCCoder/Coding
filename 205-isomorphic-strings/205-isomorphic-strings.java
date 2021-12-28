class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> res = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char x1 = s.charAt(i);
            char x2 = t.charAt(i);
            
            if(res.containsKey(x1)){
                if(x2 != res.get(x1)){
                    return false;
                }
            }else{
                if(res.containsValue(x2)){
                    return false;
                }else{
                    res.put(x1, x2);
                }
            }
        }
        return true;
    }
}

