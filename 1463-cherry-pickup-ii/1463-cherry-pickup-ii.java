class Solution {
    
    int[][] dirs=new int[][]{{1,-1},{1,0},{1,1}}; // 可移动的方向
Integer[][][] memo; // 记忆数组
public int cherryPickup(int[][] grid) {
    // 初始化记忆数组
    memo=new Integer[grid.length][grid[0].length][grid[0].length];
     // 递归求解
    return help(grid,0,0,grid[0].length-1);
}
// grid：地图
// r1：当前行
// c1：机器人1所在列
// c2：机器人2所在列
// 返回值：从当前位置到最后一行间能采摘到最多的樱桃数
int help(int[][] grid,int r1,int c1,int c2){
    // 如果记忆数组中存在当前解，返回记忆数组中的值
    if(memo[r1][c1][c2]!=null) return memo[r1][c1][c2];
    // 采摘机器人1所在位置的樱桃，并累加至返回结果
    int res=grid[r1][c1];
    // 如果两个机器人不在同一位置，采摘第二个机器人所在位置的樱桃
    if(c1!=c2) res+=grid[r1][c2];
    int max=0; // 最优解
    for(int[] d1 : dirs){ // 循环第一个机器人下一步的三种选择
        int row1=r1+d1[0],col1=c1+d1[1]; // 机器人1下一步坐标
        if(row1==grid.length) break; // 如果行越界，退出
        if(col1<0||col1==grid[0].length) continue; // 如果列越界，继续
        for(int[] d2 : dirs){ // 循环第二个机器人下一步的三种选择
            int col2=c2+d2[1]; // 机器人2下一步坐标
            if(col2<0||col2==grid[0].length) continue; // 如果列越界，继续
            // 利用两个机器人下一步坐标，递归至子函数
            // 并利用递归返回值更新最大值
            max=Math.max(max,help(grid,row1,col1,col2));
        }
    }
    res+=max; // 返回结果加上最大值
    memo[r1][c1][c2]=res; // 将返回结果计入记忆数组
    return res;
}
}