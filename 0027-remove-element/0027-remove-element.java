class Solution {
    public int removeElement(int[] nums, int val) {
        int x = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                continue;
            }
            else{
                nums[x] = nums[i]; 
                x++;
                count++;
            }
        }
        return count;
    }
}