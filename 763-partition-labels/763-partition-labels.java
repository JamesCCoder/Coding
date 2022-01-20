class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] set = new int[128];
        for(int i = 0; i<s.length(); i++){
            set[s.charAt(i)] = i;
        }
        
        int start = 0;
        int scan = 0;
        List<Integer> res = new ArrayList<>();
        
        for(int i = 0; i<s.length(); i++){
            int cur = set[s.charAt(i)];
            scan = Math.max(scan, cur);
            if(i == scan){
                res.add(i - start + 1);
                start  = i + 1;
            }
        }
        return res;
    }
}