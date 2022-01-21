class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String str1 = String.valueOf(ch);
            if(!map.containsKey(str1)){
                map.put(str1, new ArrayList<>());
            }
            map.get(str1).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}
