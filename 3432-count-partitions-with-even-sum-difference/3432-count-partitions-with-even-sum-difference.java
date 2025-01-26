class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        int partial = 0;
        int check = 0;
        for(int i=0; i<nums.length-1; i++){
            partial = partial + nums[i];
            sum = sum - nums[i];
            if(Math.abs(sum-partial) % 2 == 0){
                check++;
            }
        }
        return check;
    }
}