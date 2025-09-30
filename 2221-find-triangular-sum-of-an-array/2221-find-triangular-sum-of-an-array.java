class Solution {
    public int triangularSum(int[] nums) {
        int size = nums.length;
        for(int j=0; j<size-1; j++){
            for(int i=0; i<size-1; i++){
                nums[i] = nums[i] + nums[i+1];
                nums[i] = nums[i] % 10;
            }
        }
        return nums[0];
    }
}