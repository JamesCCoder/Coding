class Solution {
    public int numPairsDivisibleBy60(int[] time) {
    int cp = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int value : time) {
        int remainder = value % 60;
        if (map.containsKey(remainder)) {
            // 迭代累计方式
            // 找到第1个，后面再配对就是1种
            // 找到第2个，后面再配对就是2种
            cp += map.get(remainder);
        }
        if (remainder == 0) {
            // 特殊处理：余数为0的配对也是余数为0的
            map.put(0, map.getOrDefault(0, 0) + 1);
        } else {
            // 记录当前余数的配对余数
            int target = 60 - remainder;
            map.put(target, map.getOrDefault(target, 0) + 1);
        }
    }
    return cp;

    }
}

