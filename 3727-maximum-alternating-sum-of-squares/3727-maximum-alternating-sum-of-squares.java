class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = nums[i] * (-1);
            }
        }
        Arrays.sort(nums);
        long sum = 0;
        for (int i = n - 1; i >= n / 2; i--) {
            sum += (long) nums[i] * nums[i];
        }
        for (int i = (n / 2) - 1; i >= 0; i--) {
            sum -= (long) nums[i] * nums[i];
        }
        return sum;
    }
}