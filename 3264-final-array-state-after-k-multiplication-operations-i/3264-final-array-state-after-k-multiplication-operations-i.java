class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int count = 0;
        while(count != k){
            int min = Integer.MAX_VALUE;
            int a = 0;
            for(int i=0; i<nums.length; i++){
                if(min > nums[i]){
                    min = nums[i];
                    a = i;
                }
            }
            nums[a] = nums[a]*multiplier;
            count++;
        }
        return nums;
    }
}