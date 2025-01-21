class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0, maxSum = Integer.MIN_VALUE, currentMax = 0;
        int minSum = Integer.MAX_VALUE, currentMin = 0;

        for (int num : nums) {
            currentMax = Math.max(currentMax + num, num);
            maxSum = Math.max(maxSum, currentMax);

            currentMin = Math.min(currentMin + num, num);
            minSum = Math.min(minSum, currentMin);

            totalSum += num;
        }
        if (maxSum < 0) {
            return maxSum;
        }
        return Math.max(maxSum, totalSum - minSum);
    }
}
