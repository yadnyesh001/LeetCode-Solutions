class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        int count = 0;
        long newsum = 0;
        for(int i=0; i<nums.length-1; i++){
            newsum = newsum + nums[i];
            if(newsum >= sum - newsum){
                count++;
            }
        }
        return count;
    }
}