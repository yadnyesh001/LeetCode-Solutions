class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int j = 1 ; j < n ; j++){
            if(nums[j] != nums[k]){
              nums[k+1] = nums[j];
              k++;
            }
        }
        return k+1;

    }
}