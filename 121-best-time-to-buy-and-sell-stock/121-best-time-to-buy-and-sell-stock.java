class Solution {
    public int maxProfit(int[] prices) {
        int lowprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int price: prices){
            lowprice = Math.min(lowprice, price);
            maxprofit = Math.max(maxprofit, price - lowprice);
        }
        return maxprofit;
    }
}