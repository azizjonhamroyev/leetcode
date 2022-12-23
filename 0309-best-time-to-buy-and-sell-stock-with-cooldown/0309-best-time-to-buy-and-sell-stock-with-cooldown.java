public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int[] profits = new int[prices.length];
        profits[0] = 0;
        int cash = -prices[0];
        profits[1] = Math.max(0, prices[1] - prices[0]);
        cash = Math.max(cash, -prices[1]);
        for (int i = 2; i < prices.length; i++) {
            profits[i] = Math.max(profits[i - 1], cash + prices[i]);
            cash = Math.max(cash, profits[i - 2] - prices[i]);
        }
        return profits[prices.length - 1];
    }
}