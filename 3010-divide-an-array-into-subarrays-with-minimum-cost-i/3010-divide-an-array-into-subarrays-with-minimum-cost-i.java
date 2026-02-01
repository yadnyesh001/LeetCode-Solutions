class Solution {
    public int minimumCost(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int sum = nums[0];
        for(int i=1; i<nums.length; i++){
            if(min1 > nums[i]){
                min2 = min1;
                min1 = nums[i];
            }
            else if(min2 > nums[i]){
                min2 = nums[i];
            }
        }
        sum = sum + min1 + min2;
        return sum;
    }
}