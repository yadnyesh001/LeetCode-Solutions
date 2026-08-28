class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        double sum = 0;
        int n = discounts.length - 1;
        int x = prices.length;

        for (int i = 0; i < x; i++) {
            if (n >= 0) {
                sum += prices[x - i - 1] * (100.0 - discounts[n]) / 100.0;
                n--;
            } else {
                sum += prices[x-i-1];
            }
        }

        return sum;
    }
}