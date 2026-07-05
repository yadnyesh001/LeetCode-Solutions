class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(nums[n-i-1], max);
            arr[n-i-1] = max;
        }
        int ans = 0;
        for(int i=0; i<n-k; i++){
            ans = Math.max(nums[i] + arr[i+k], ans);
        }
        return ans;
    }
}