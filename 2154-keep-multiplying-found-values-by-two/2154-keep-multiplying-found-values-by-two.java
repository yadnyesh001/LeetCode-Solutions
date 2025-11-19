class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int x = original;
        while(true){
            if(!set.contains(x)){
                return x;
            }
            x = x*2;
        }
    }
}