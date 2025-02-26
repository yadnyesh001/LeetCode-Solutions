class Solution {
    public int maxAbsoluteSum(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
            if(max < nums[i]){
                max = nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
        return Math.max(max, Math.max(Math.abs(min), Math.abs(max - min)));
    }
}