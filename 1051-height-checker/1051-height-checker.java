class Solution {
    public int heightChecker(int[] heights) {
        int heightss[] = heights.clone();
        Arrays.sort(heights);
        int res = 0;
        for(int i = 0; i<heights.length; i++){
            if(heights[i]!=heightss[i]){
                res++;
            }
        }
        return res;
    }
}