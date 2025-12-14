class Solution {
    public int absDifference(int[] nums, int k) {
        int max = 0;
        int min = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<k; i++){
            min = min + nums[i];
            max = max + nums[n-i-1];
        }
        return Math.abs(max - min);
    }
}