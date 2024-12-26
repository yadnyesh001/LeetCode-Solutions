class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;
        
        // Iterate through the array starting from index 1
        for (int i = 1; i < prices.length; i++) {
            // If today's price is higher than yesterday's price
            if (prices[i] > prices[i-1]) {
                // Add the profit to our total
                totalProfit += prices[i] - prices[i-1];
            }
        }
        
        return totalProfit;
    }
}