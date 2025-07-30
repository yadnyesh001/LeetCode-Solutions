class Solution {
    public int longestSubarray(int[] nums) {
        int length = 1;
        int max = nums[0];
        int max_length = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == max){
                length++;
                max_length = Math.max(max_length, length);
            }
            else if(nums[i] > max){
                max = nums[i];
                length = 1;
                max_length = 1;
            }
            else{
                length = 0;
            }
        }
        return max_length;
    }
}