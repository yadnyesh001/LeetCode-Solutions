class Solution {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        int n = nums.length;
        int count = 1;
        for(int i=1; i<n; i++){
            if(nums[i] == ans){
                count++;
            }
            else if(count > 1){
                count--;
            }
            else{
                ans = nums[i];
            }
        }
        return ans;
    }
}