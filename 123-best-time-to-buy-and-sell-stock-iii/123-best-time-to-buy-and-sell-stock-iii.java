class Solution {
    public int maxProfit(int[] prices) {
        int minprice1 = 99999;
        int minprice2 = 99999;
        int maxprofit1 = 0;
        int maxprofit2 = 0;
        
        for(int price: prices){
            minprice1 = Math.min(minprice1, price);
            maxprofit1 = Math.max(maxprofit1, price - minprice1);
            minprice2 = Math.min(minprice2, price - maxprofit1);
            maxprofit2 = Math.max(maxprofit2, price - minprice2);
        }
        return maxprofit2;
    }
}