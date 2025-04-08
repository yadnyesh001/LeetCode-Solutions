class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = nums.length-1;
        int count = 0;
        while(!set.contains(nums[i])){
            set.add(nums[i]);
            count++;
            i--;
            if(i < 0){
                break;
            }
        }   
        if((nums.length - count) % 3 != 0){
            return (nums.length - count)/3 + 1;
        }
        return (nums.length - count)/3;
    }
}