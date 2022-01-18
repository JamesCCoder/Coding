class Solution {
    public boolean canPartition(int[] nums) {
       int len = nums.length;
        // 阴间案例
        if(len == 1) return false;
        // 求nums[i]的总和sum
        int sum = 0;
        for(int num : nums) sum += num;
        // 若sum为奇数不可能凑成和相等的两堆
        if(sum % 2 == 1) return false;
        // 设背包容量为target
        int target = sum / 2;
        // 创建dp数组(为了方便处理让j下标拓展至target)
        int[] dp = new int[target + 1];
        // 初始化状态(dp[0]=0)可忽略
        // 遍历每种状态(习惯先遍历物品再遍历背包容量,且背包容量倒序)
        // 物品[0,len-1]
        for(int i = 0; i < len; i++) {
            // j<nums[i]部分不用转移了,继承上一轮的dp[j]
            for(int j = target; j >= nums[i]; j--) {
                // 只转移j>=nums[i]部分的状态
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }  
        }
        // 最后返回能否凑到价值为target的物品
        return dp[target] == target;
    }
}