class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);
        
        int res = 0;
        int idx = 0;
        while(idx < s.length()){
            if(idx < s.length()-1){
                if(map.containsKey(s.substring(idx, idx+2))){
                   res += map.get(s.substring(idx, idx + 2));
                   idx = idx + 2;
                   continue;
               }
            }
            
            if(map.containsKey(s.substring(idx, idx + 1))){
                res += map.get(s.substring(idx, idx + 1));
                idx++;
            }
            
            
        }
        return res;
    }
}