class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        // starting from day 2
        for (int i = 1; i < prices.length; i++) {
            // check if there's profit vs prev day
            if(prices[i] > prices[i-1]) { // is profitable?
                int profit = prices[i] - prices[i-1];
                // accumulate profit
                maxProfit += profit;
            }
        }
        return maxProfit;
    }
}