class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currentMax = 0;
        int currentMin = 0;
        for(int i=0; i<nums.length; i++){
            totalSum += nums[i];
            currentMax += nums[i];
            if(currentMax > maxSum){
                maxSum = currentMax;
            }
            if(currentMax < 0){
                currentMax = 0;
            }
            currentMin += nums[i];
            if(currentMin < minSum){
                minSum = currentMin;
            }
            if(currentMin > 0){
                currentMin = 0;
            }
        }
        if(maxSum < 0){
            return maxSum;
        }
        return Math.max(maxSum, totalSum - minSum);
    }
}