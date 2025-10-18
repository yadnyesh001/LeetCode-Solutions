class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int lastUsed = Integer.MIN_VALUE;
        int distinctCount = 0;

        for (int num : nums) {
            int modifiedValue = Math.max(num - k, lastUsed + 1);
            if (modifiedValue <= num + k) {
                lastUsed = modifiedValue;
                distinctCount++;
            }
        }
        return distinctCount;
    }
}