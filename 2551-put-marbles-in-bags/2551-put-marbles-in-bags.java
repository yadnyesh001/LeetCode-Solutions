class Solution {
    public long putMarbles(int[] weights, int k) {
        int n = weights.length;
        if (k == n) return 0;
        int[] pairSums = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            pairSums[i] = weights[i] + weights[i+1];
        }
        Arrays.sort(pairSums);
        long res = 0L;
        for (int i = 0; i < k-1; i++) {
            res += pairSums[n-2-i] - pairSums[i];
        }
        return res;
    }
}
