class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        if (k == n) return 0;
        for (int i = 1; i < n; i++){
            weights[i-1] = weights[i] + weights[i-1];
        }
        weights[n-1] = Integer.MAX_VALUE;
        Arrays.sort(weights);
        long res = 0L;
        for (int i = 0; i < k-1; i++){
            res += weights[n-2-i] - weights[i];
        }
        return res;
    }
}