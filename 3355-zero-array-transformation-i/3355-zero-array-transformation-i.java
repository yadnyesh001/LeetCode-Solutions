class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int max = -1;
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        if(max <= queries.length){
            return true;
        }
        return false;
    }
}