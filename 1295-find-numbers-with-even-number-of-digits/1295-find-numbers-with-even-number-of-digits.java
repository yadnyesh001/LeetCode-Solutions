class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int sum=0;
        for(int i=0; i<n; i++){
            if(nums[i]/10 > 0 && nums[i]/10 < 10){
                sum++;
            }
            if(nums[i]/10 > 99 && nums[i]/10 < 1000){
                sum++;
            }
            if(nums[i]/10 > 9999 && nums[i]/10 < 100000){
                sum++;
            }
        }
        return sum;
        
    }
}