class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] c1 = new int[128];
        int[] c2 = new int[128];
        int m = s.length();
        int n = p.length();
        
        for(int i = 0; i<n; i++){
            c2[p.charAt(i)]++;
        }
        
        for(int l = 0, r = 0; r<m; r++){
            c1[s.charAt(r)]++;
            if(r - l + 1 > n){
                c1[s.charAt(l++)]--;
            }
            if(Arrays.equals(c1, c2)){
                res.add(l);
            }
        }
        return res;
        
    }
    

}