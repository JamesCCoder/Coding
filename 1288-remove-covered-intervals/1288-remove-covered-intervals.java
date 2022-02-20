class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
     Arrays.sort(intervals, (a, b) -> a[0]==b[0]?Integer.compare(b[1],a[1]):Integer.compare(a[0], b[0]));
        int count = 1;
        for (int i = 0, j = 1; j < intervals.length; j++) {
            if (intervals[i][1] < intervals[j][1]) {
                i = j;
                count++;
            }
        }
        return count;
    }
}