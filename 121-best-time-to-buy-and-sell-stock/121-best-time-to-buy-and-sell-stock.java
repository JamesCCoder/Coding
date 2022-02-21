class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;
        for(int price: prices){
            minprice = Math.min(minprice, price);
            maxprofit = Math.max(maxprofit, price- minprice);
        }
        return maxprofit;
    }
}