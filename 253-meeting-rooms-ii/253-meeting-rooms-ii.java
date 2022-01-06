class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (int[] a, int[] b) -> (a[0] - b[0]));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> (a-b));
        minHeap.add(intervals[0][1]);
        
        for(int i = 1; i<intervals.length; i++){
            if(intervals[i][0] >= minHeap.peek()){
                minHeap.poll();
            }
            minHeap.add(intervals[i][1]);
        }
        return minHeap.size();
    }
}