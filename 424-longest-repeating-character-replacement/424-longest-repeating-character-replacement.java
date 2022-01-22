class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        int[] cnt = new int[128];
        char[] ch = s.toCharArray();
        for(int l = 0, r = 0; r < s.length(); r++){
            cnt[ch[r]]++;
            while(!check(cnt, k)){
                cnt[ch[l++]]--;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
    
    public boolean check(int[] cnt, int k){
        int max = 0;
        int sum = 0;
        for(int i = 0; i<128; i++){
            max = Math.max(max, cnt[i]);
            sum += cnt[i];
        }
        return sum - max <= k;
    }
}