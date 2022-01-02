class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0 || intervals == null) return intervals;
        Arrays.sort(intervals, (int[] a, int[] b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        
        for(int i = 1; i<intervals.length; i++){
            int[] lastArray = res.get(res.size()-1);
            if(lastArray[1] >= intervals[i][0]){
                lastArray[1] = Math.max(lastArray[1], intervals[i][1]);
            }else{
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}