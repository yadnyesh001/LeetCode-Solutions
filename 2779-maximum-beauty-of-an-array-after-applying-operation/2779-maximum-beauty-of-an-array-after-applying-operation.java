class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int max = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] - nums[i] <= 2*k){
                    max = Math.max(max, j-i);
                }
            }
        }
        return max+1;
    }
}