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
        
        int index = 0;
        int res = 0;
        
        while(index < s.length()){
            if(index < s.length()-1){
                String db = s.substring(index, index + 2);
                if(map.containsKey(db)){
                    res += map.get(db);
                    index = index + 2;
                    continue;
                }
            }
            String sg = s.substring(index, index + 1);
            if(map.containsKey(sg)){
                res += map.get(sg);
                index = index + 1;
            }
        }
        return res;
    }
}