class Solution {
    public int dominantIndices(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            sum = sum + nums[i];
        }
        int x = n;
        int count = 0;
        for(int i=0; i<n-1; i++){
            sum = sum - nums[i];
            x--;
            if(nums[i] > (int)(sum/x)){
                count++;
            }
        }
        return count;
    }
}