class Solution {
    public int maxProfit(int[] prices) {
        int acost = Integer.MAX_VALUE;
        int bcost = Integer.MAX_VALUE;
        int aprofit = 0;
        int bprofit = 0;
        
        for(int i = 0; i<prices.length; i++){
            acost = Math.min(acost, prices[i]);
            aprofit = Math.max(aprofit, prices[i] - acost);
            bcost = Math.min(bcost, prices[i]-aprofit);
            bprofit = Math.max(bprofit, prices[i]- bcost);
        }
        return bprofit;
    }
}