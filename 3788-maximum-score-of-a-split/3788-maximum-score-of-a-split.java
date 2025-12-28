class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length; 
        long arr[] = new long[n-1];
        int min = Integer.MAX_VALUE;
        for(int i=n-1; i>=1; i--){
            min = Math.min(min, nums[i]);
            arr[i-1] = min;
        }
        long sum = 0;
        long max = Long.MIN_VALUE;
        for(int i=0; i<n-1; i++){
            sum = sum + nums[i];
            max = Math.max(max, sum - arr[i]);
        }
        return max;
    }
}