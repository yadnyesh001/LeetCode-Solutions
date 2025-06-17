class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int allow = 0;
        int sum = nums.length - 1;
        int ans = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (sum <= nums[i]) {
                ans = i;
                break;
            } else {
                sum = sum - 1;
            }
        }
        return ans + 1;
    }
}