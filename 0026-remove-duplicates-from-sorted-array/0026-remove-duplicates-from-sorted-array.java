class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int x = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                x++;
                nums[x] = nums[i];
            }
        }
        return x+1;
    }
}