class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums[0] < k){
            return -1;
        }
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == k && !set.contains(nums[i])){
                set.add(nums[i]);
            }
            else if(!set.contains(nums[i])){
                set.add(nums[i]);
                count++;
            }
        }
        return count;
    }
}