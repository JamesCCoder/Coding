class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m = ransomNote.length();
        int n = magazine.length();
        if(m > n) return false;
        
        HashMap<Character, Integer> r = new HashMap<>();
        for(char c: magazine.toCharArray()){
            r.put(c, r.getOrDefault(c, 0) + 1);
        }
        int sum = 0;
        for(char c: ransomNote.toCharArray()){
            if(r.containsKey(c)){
                r.put(c, r.getOrDefault(c, 0) - 1);
                if((r.getOrDefault(c, 0)) < 0) return false;
                sum++;                
            }
        }
        return sum == m;
    }
}