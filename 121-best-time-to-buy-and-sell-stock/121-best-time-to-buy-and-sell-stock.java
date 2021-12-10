class Solution {
    public int maxProfit(int[] prices) {
        int minprofit = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i<prices.length; i++){
            if(prices[i]<minprofit){
                minprofit = prices[i];
            }else if(prices[i]-minprofit>maxprofit){
                maxprofit = prices[i]-minprofit;
            }
        }
        return maxprofit;
    }
}