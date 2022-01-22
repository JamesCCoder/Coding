class Solution {
    public int characterReplacement(String s, int k) {
        char[] cs = s.toCharArray();
        int[] cnt = new int[128];
        
        int ans = 0;
        
        for(int l = 0, r = 0; r < s.length(); r++){
            cnt[cs[r]]++;
            while(!check(cnt, k)){
                cnt[cs[l++]]--;
            }
            
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
    
    public boolean check(int[] cnt, int k){
        int max = 0;
        int sum = 0;
        for(int i = 0; i< 128; i++){
            max = Math.max(max, cnt[i]);
            sum += cnt[i];
        }
        return sum - max <= k;
    }
}