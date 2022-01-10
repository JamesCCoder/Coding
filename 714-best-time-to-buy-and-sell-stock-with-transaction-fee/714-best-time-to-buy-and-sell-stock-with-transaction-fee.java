class Solution {
    public int maxProfit(int[] prices, int fee) {
        int sold = 0, hold = -prices[0];
        for (int price : prices) {
            int t = sold;
            sold = Math.max(sold, hold + price - fee);
            hold = Math.max(hold, t - price);
        }
        return sold;
    }
}