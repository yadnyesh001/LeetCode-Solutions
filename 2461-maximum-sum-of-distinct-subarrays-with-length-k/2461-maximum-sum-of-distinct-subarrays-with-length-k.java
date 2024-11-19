class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        int j = 0;
        long sum = 0;
        Set<Integer> ans = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!ans.contains(nums[i])){
                sum = sum + nums[i];
                ans.add(nums[i]);

                if(i - j + 1 == k){
                    max = Math.max(max, sum);
                    sum = sum - nums[j];
                    ans.remove(nums[j]);
                    j++;
                }
            }
            else{
                while(nums[j] != nums[i]){
                    sum = sum - nums[j];
                    ans.remove(nums[j]);
                    j++;
                }
                j++;
            }
        }
        return max;
    }
}