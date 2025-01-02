class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sum = 0;
        long count = 0;
        long result = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                count++;
                result = result + count;
            }
            else{
                count = 0;
                sum = sum + result;
                result = 0;
            }
        }
        sum = sum + result;
        return sum;
    }
}