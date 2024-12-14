class Solution {
    public long continuousSubarrays(int[] nums) {
        long count = 0;
        int start = 0;
        int min = nums[0];
        int max = nums[0];
        for (int end = 0; end < nums.length; end++) {
            min = Math.min(min, nums[end]);
            max = Math.max(max, nums[end]);
            while (max - min > 2) {
                start++;
                min = nums[start];
                max = nums[start];
                for (int k = start; k <= end; k++) {
                    min = Math.min(min, nums[k]);
                    max = Math.max(max, nums[k]);
                }
            }
            count += (end - start + 1);
        }
        return count;
    }
}
