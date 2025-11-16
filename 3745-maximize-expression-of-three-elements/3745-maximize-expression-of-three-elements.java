class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max1 = -101;
        int max2 = -101;
        int min = 101;
        for(int i=0; i<nums.length; i++){
            if(max1 < nums[i]){
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i] > max2){
                max2 = nums[i];
            }
            min = Math.min(min, nums[i]);
        }
        return max1 + max2 - min;
    }
}