class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length == 1) {
            return 0;
        }

        int buy_idx = 0;
        int sell_idx = 0;
        int max_profit = 0;

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] - prices[buy_idx] > max_profit) {
                sell_idx = i;
                max_profit = prices[i] - prices[buy_idx];
            } else if (prices[i] <  prices[buy_idx]){
                buy_idx = i;
                sell_idx = i;
            }
        }

        return max_profit;
    }
}
