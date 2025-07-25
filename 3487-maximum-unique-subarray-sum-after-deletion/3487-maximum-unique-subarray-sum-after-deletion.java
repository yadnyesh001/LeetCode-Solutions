class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                count++;
                continue;
            }
            else if(!set.contains(nums[i])){
                sum = sum + nums[i];
                set.add(nums[i]);
            }
            else{
                continue;
            }
        }
        if(sum == 0 && count > 0){
            int ans = Integer.MIN_VALUE;
            for(int i=0; i<nums.length; i++){
                ans = Math.max(ans, nums[i]);
            }
            return ans;
        }
        return sum;
    }
}