class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i+10 <=s.length(); i++){
            String cur = s.substring(i, i + 10);
            int cnt = map.getOrDefault(cur, 0);
            if(cnt == 1){
                res.add(cur);
            }
            map.put(cur, cnt + 1);
        }
        return res;
    }
}