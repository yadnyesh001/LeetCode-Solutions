class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
            ans = Math.max(ans, nums[i] - min);
        }
        if(ans == 0){
            return -1;
        }
        return ans;
    }
}