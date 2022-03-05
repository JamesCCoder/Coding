class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int res = 1;
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        for(int i = 0, j = 1;j<intervals.length; j++){
            if(intervals[i][1] < intervals[j][1]){
                i = j;
                res++;
            }
        }
        return res;
    }
}