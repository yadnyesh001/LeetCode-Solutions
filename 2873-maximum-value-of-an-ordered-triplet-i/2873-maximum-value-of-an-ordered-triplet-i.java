class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxValue = 0;

        for (int j = 1; j < n - 1; j++) {
            long maxA = 0; 
            for (int i = 0; i < j; i++) {
                maxA = Math.max(maxA, nums[i]);
            }
            for (int k = j + 1; k < n; k++) {
                maxValue = Math.max(maxValue, (maxA - nums[j]) * (long) nums[k]);
            }
        }
        return maxValue;
    }
}