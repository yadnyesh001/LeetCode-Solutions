class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        // Sort the array to process elements in ascending order
        Arrays.sort(nums);
        
        // Track the last used distinct value
        int lastUsed = Integer.MIN_VALUE;
        int distinctCount = 0;

        for (int num : nums) {
            // Compute the smallest valid value in [num-k, num+k] that is > lastUsed
            int modifiedValue = Math.max(num - k, lastUsed + 1);

            // If this value is within the range [num-k, num+k], use it
            if (modifiedValue <= num + k) {
                lastUsed = modifiedValue;
                distinctCount++;
            }
        }

        return distinctCount;
    }
}