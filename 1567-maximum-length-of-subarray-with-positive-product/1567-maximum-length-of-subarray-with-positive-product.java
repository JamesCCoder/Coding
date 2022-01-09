class Solution {
    public int getMaxLen(int[] nums) {
        //维护当前正数子数组长度与负数子数组长度
        int posLen = 0;
        int negLen = 0;
        int max = 0;
        //依次遍历分类讨论
        for (int i : nums){
            if (i == 0){
                posLen = 0;
                negLen = 0;
                continue;
            }
            //当前乘数大于0时
            if (i > 0){
                posLen++;
                negLen = negLen == 0? 0:negLen+1;
            }
			//当前乘数小于0时
            if (i < 0){
                int temp = posLen;
                posLen = negLen == 0 ? 0 :negLen+1;
                negLen = temp+1;
            }
            //滚动变量用来记录最大值
            max = Math.max(max,posLen);
        }
        return max;

    }
}