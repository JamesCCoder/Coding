class Solution {
    public int maxProfit(int[] prices) {
        int minprice = 99999;
        int maxprofit = 0;
        for(int price: prices){
            minprice = Math.min(minprice, price);
            maxprofit = Math.max(maxprofit, price - minprice);
        }
        return maxprofit;
    }
}