class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        
        int[] c1 = new int[128];
        int[] c2 = new int[128];
        
        for(int i = 0; i<p.length(); i++){
            c2[p.charAt(i)]++;
        }
        
        for(int l = 0, r = 0; r < n; r++){
            c1[s.charAt(r)]++;
            if(r - l + 1 > m){
                c1[s.charAt(l++)]--;
            }
            if(check(c1, c2)){
                ans.add(l);
            }
            
        }
        return ans;
    }
    
    public boolean check(int[] c1, int[] c2){
        for(int i = 0; i< 128; i++){
            if(c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }
}