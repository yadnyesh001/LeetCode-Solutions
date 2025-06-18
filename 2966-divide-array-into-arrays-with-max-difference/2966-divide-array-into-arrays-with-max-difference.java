class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] result = new int[n / 3][3];
        Arrays.sort(nums);
        int p = 0;
        for (int i = 0; i < n / 3; i++) {
            int a = nums[p];
            result[i][0] = nums[p++];
            result[i][1] = nums[p++];
            result[i][2] = nums[p++];
            if (result[i][2] - a > k) {
                return new int[0][0];
            }
        }
        return result;
    }
}