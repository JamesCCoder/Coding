class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i = 0;
        while(i< intervals.length && intervals[i][1] < newInterval[0]){
            res.add(new int[]{intervals[i][0], intervals[i][1]});
            i++;
        }
        
        while(i<intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        res.add(new int[]{newInterval[0], newInterval[1]});
       
        while(i<intervals.length){
            res.add(new int[]{intervals[i][0], intervals[i][1]});
            i++;
        }
        
        int[][] result = new int[res.size()][2];
        for(i = 0; i<res.size(); i++){
            result[i][0] = res.get(i)[0];
            result[i][1] = res.get(i)[1];
        }
        return result;
    }
}