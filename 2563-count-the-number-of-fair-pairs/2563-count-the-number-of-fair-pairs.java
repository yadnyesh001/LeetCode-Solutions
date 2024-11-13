class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        long count = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            sum = sum + nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(sum + nums[j] >= lower && sum + nums[j] <= upper){
                    count++;
                }
            }
        }
        return count;
    }
}