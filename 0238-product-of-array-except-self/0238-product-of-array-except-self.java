class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zerosum = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                prod = prod * nums[i];
            }
            else{
                zerosum = 1;
                count++;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(count > 1){
                nums[i] = 0;
            }
            else if(nums[i] == 0){
                nums[i] = prod;
            }
            else if(zerosum == 1){
                nums[i] = 0;
            }
            else{
                nums[i] = prod/nums[i];
            }
        }
        return nums;
    }
}