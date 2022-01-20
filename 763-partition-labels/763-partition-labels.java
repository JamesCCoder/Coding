class Solution {
    public List<Integer> partitionLabels(String s) {
        // map 记录每个字母对应的最远位置
        int[] map = new int[26];
        Arrays.fill(map, -1);
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a'] = i;
        }
        // start 做切合的开始位置
        int start = 0;
        // scannedCharMaxPos 已扫描的字符串去到的最远位置
        int scannedCharMaxPos = 0;
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            // 当前正在遍历的字符所能去到的最远距离
            int currentCharMaxPos = map[s.charAt(i) - 'a'];
            // 更新已扫描的字符所能去到的最远距离
            scannedCharMaxPos = Math.max(scannedCharMaxPos, currentCharMaxPos);
            if (i == scannedCharMaxPos) {
                res.add(i - start + 1);
                start = i + 1;
            }
        }
        return res;
    }
}