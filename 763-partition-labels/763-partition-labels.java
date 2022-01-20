class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] set = new int[26];
        Arrays.fill(set, -1);
        for(int i = 0; i<s.length(); i++){
            set[s.charAt(i) - 'a'] = i;
        }
        
        int start = 0;
        int scan = 0;
        List<Integer> res = new ArrayList<>();
        
        for(int i = 0; i<s.length(); i++){
            int cur = set[s.charAt(i) - 'a'];
            scan = Math.max(scan, cur);
            if(i == scan){
                res.add(i - start + 1);
                start = i + 1;
            }
        }
        return res;
    }
}