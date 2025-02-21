class Solution {
    public int minimumAverageDifference(int[] nums) {
        long answer = Integer.MAX_VALUE;
        int finalanswer = 0;
        long presum = 0;
        long totalsum = 0;

        for (int num : nums) {
            totalsum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            presum += nums[i];
            long sufsum = totalsum - presum;
            long leftAverage = presum / (i + 1);
            long rightAverage = (i < nums.length - 1) ? sufsum / (nums.length - i - 1) : 0;

            long x = Math.abs(leftAverage - rightAverage);

            if (x < answer) {
                answer = x;
                finalanswer = i;
            }
        }
        return finalanswer;
    }
}