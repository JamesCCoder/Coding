class Solution {

    
        public int maxScoreSightseeingPair(int[] values) {
        int n=values.length;
        int max=Integer.MIN_VALUE;
        int temp=values[0];
        for(int i=1;i<n;i++){
            int t=values[i]+i;
            max=Math.max(max,temp+values[i]-i);
            temp=Math.max(temp,t);
        }
        return max;
   
            
    }
}