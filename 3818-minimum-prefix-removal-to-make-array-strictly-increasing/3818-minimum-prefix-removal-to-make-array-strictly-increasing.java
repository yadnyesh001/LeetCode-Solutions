class Solution {
    public int minimumPrefixLength(int[] nums) {
        int count = 1;
        int n = nums.length;
        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                count++;
            }
            else{
                break;
            }
        }
        return n - count;
    }
}