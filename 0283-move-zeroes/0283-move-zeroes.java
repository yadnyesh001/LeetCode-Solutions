class Solution {
    public void moveZeroes(int[] nums) {
        int current = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                count++;
            }
            else{
                nums[current] = nums[i];
                current++;
            }
        }

        for(int i=0; i<count; i++){
            nums[nums.length-1-i] = 0;
        }
    }
}