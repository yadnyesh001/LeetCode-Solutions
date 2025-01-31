class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        if(nums[0] == 0){
            return false;
        }
        int allow = 0;
        int sum = nums.length - 1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == 0 && i >= allow){
                return false;
            }
            if (sum <= nums[i]) {
                return true;
            } else {
                sum = sum - 1;
                int abc = i + nums[i];
                allow = Math.max(allow, abc);
            }
        }
        return false;
    }
}