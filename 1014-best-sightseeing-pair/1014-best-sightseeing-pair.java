class Solution {

    
public int maxScoreSightseeingPair(int[] values) {
        int res = 0, n = values.length, mx = 0;
        for (int i = 0; i < n; ++i) {
            res = Math.max(res, mx + values[i] - i);
            mx = Math.max(mx, values[i] + i);
        }
        return res;
    }
}
