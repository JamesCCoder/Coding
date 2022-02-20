class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m = ransomNote.length();
        int n = magazine.length();
        
        if(m > n) return false;
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: magazine.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int sum = 0;
        for(char c: ransomNote.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) - 1);
            if(map.get(c) < 0){
                return false;
            }
            sum++;
        }
        return sum == m;
    }
}