class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = -1;
        for(int i=1; i<prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
            }
            max = Math.max(prices[i]-min, max);
        }
        return max;
    }
}