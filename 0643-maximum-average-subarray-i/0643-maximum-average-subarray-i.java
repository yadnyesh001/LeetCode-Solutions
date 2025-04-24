class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        double sum = 0;
        for(int j=0; j<k; j++){
            sum = sum + nums[j];
        }
        avg = sum/k;
        int i = 0;
        for(int j=k; j<nums.length; j++){
            sum = sum - nums[i] + nums[j];
            avg = Math.max(avg, sum/k);
            i++;
        }
        return avg;
    }
}