class Solution {
    public int minOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        int i = nums.length-1;
        while(!set.contains(nums[i])){
            set.add(nums[i]);
            count++;
            i--;
            if( i < 0){
                break;
            }
        }
        if((nums.length - count) % 3 == 0){
            return (nums.length - count)/3;
        }
        return (nums.length - count)/3 + 1;
    }
}