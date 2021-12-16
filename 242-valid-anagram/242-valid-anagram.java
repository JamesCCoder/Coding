class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> m = new HashMap<>();
        for(int i = 0;i<s.length(); i++){
            char c = s.charAt(i);
            if(m.containsKey(c)){
                m.put(c, m.get(c)+1);
            }else{
                m.put(c, 1);
            }
        }
        
        for(int i=0;i<t.length(); i++){
            char c = t.charAt(i);
            if(!m.containsKey(c)){
                return false;
            }
            
            int count = m.get(c);
            if(count == 1){
                m.remove(c);
            }else{
                m.put(c, m.get(c)-1);
            }
        }
        return m.isEmpty();
    }
}