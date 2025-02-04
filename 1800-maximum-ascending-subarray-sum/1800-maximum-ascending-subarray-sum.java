class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            max = Math.max(max, sum);
            if(i == nums.length-1){
                break;
            }
            if(nums[i] >= nums[i+1]){
                sum = 0;
            }   
        }
        return max;

    }
}