class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for(int i=1; i<nums.length-1; i++){
            if (Math.abs((float) nums[i - 1] + (float) nums[i + 1] - (float) nums[i] / 2) < 1e-6) {
                count++;
            }
        }
        return count;
    }
}