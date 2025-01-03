class Solution {
    public int waysToSplitArray(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        int count = 0;
        int tillsum = 0;
        for(int i=0; i<nums.length-1; i++){
            tillsum += nums[i];
            if(tillsum >= sum - tillsum){
                count++;
            }
        }
        return count;
    }
}