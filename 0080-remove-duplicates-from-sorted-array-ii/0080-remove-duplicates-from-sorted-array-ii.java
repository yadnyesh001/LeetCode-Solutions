class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int x = 1;
        int duplicate = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1] && duplicate < 2){
                nums[x] = nums[i];
                x++;
                duplicate++;
            }
            else if(nums[i] == nums[i-1] && duplicate == 2){
                count++;
            }
            else if(nums[i] != nums[i-1]){
                nums[x] = nums[i]; 
                duplicate = 1;
                x++;
            }
        }
        return nums.length - count;
    }
}