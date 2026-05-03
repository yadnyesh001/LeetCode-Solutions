class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int counte = 0;
        int counto = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] % 2 == 0) {
                ans[i] = counto;
                counte++;
            } else {
                ans[i] = counte;
                counto++;
            }
        }
        return ans;
    }

}