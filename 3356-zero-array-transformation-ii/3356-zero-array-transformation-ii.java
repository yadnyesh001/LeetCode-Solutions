class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length, m = queries.length;
        int left = 1, right = m, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canMakeZero(nums, queries, mid)) {
                ans = mid;  
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private boolean canMakeZero(int[] nums, int[][] queries, int k) {
        int n = nums.length;
        int[] diff = new int[n + 1]; 
        for (int i = 0; i < k; i++) {
            int l = queries[i][0], r = queries[i][1], val = queries[i][2];
            diff[l] -= val;
            if (r + 1 < n) diff[r + 1] += val;
        }
        int currentDecrement = 0;
        for (int i = 0; i < n; i++) {
            currentDecrement += diff[i];
            if (nums[i] + currentDecrement > 0) return false;
        }
        return true; 
    }
}
