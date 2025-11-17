class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = 0;
        int x = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                x = i;
                break;
            }
        }
        for(int i=x+1; i<nums.length; i++){
            if(nums[i] == 1){
                if(count < k){
                    return false;
                }
                count = 0;
            }
            else{
                count++;
            }
        }
        return true;
    }
}