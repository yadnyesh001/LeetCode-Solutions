class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            ans.add(nums[i]);
        }
        for(int i=1; i<=nums.length; i++){
            if(!ans.contains(i)){
                return i;
            }
        }
        return nums.length+1;
    }
}