class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> map =new  HashMap<>();
        map.put("M",1000);
        map.put("CM",900);
        map.put("D",500);
        map.put("CD",400);
        map.put("C",100);
        map.put("XC",90);
        map.put("L",50);
        map.put("XL",40);
        map.put("X",10);
        map.put("IX",9);
        map.put("V",5);
        map.put("IV",4);
        map.put("I",1);
        
        int res = 0;
        int i = 0;
        
        while(i<s.length()){
            if(i<s.length()-1){
                String db = s.substring(i,i+2);
                if(map.containsKey(db)){
                    res += map.get(db);
                    i += 2;
                    continue;
                }
            }
            String sg = s.substring(i, i+1);
            if(map.containsKey(sg)){
                    res += map.get(sg);
                    i += 1;
                }
        }
        return res;
    }
}