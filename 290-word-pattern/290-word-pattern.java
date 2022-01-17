class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> res = new HashMap<>();
        String[] x2 = s.split(" ");
        if(pattern.length() != x2.length) return false;
        for(int i = 0; i< pattern.length(); i++){
            char x1 = pattern.charAt(i);
            if(res.containsKey(x1)){
                if(!x2[i].equals(res.get(x1))){
                    return false;
                }
            }else{
                if(res.containsValue(x2[i])){
                    return false;
                }else{
                    res.put(x1, x2[i]);
                }
            }
        }
        return true;
    }
}