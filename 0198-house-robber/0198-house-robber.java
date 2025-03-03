class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int max = nums[0];
        for(int i=2; i<nums.length; i++){
            if(max > nums[i-2]){
                nums[i] = nums[i] + max;
            }
            else{
                nums[i] = nums[i] + nums[i-2];
                max = nums[i-2];
            }
        }
        return Math.max(nums[nums.length-1], nums[nums.length-2]);
    }
}