class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        if((sum + target) % 2 != 0 || Math.abs(target) > sum){
            return 0;
        }
        int size = (sum + target)/2;
        int dp[] = new int[size+1];
        dp[0] = 1;
        for(int num : nums){
            for(int j=size; j>=num; j--){
                dp[j] += dp[j-num];
            }
        }
        return dp[size];
    }
}