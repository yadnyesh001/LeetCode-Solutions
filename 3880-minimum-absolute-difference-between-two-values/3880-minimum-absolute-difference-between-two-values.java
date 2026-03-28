class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int one = -1;
        int min = Integer.MAX_VALUE;
        int two = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                one = i;
            }
            else if(nums[i] == 2){
                two = i;
            }
            if(one >= 0 && two >= 0){
                min = Math.min(min, Math.abs(two - one));
            }
        }
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}