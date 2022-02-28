class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] res = new int[intervals.length][2];
        Arrays.sort(intervals, (int[] a, int[] b) -> a[0] - b[0]);
        int idx = 0;
        for(int i = 0; i<intervals.length; i++){
            if(idx == 0 || intervals[i][0] > res[idx-1][1]){
                res[idx] = intervals[i];
                idx++;
            }else{
                res[idx-1][1] = Math.max(res[idx-1][1], intervals[i][1]);
            }
        }
        return Arrays.copyOf(res, idx);
    }
}