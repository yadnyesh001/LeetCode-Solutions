class Solution {
    public int partitionDisjoint(int[] nums) {
        int minIndex = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(min > nums[i]){
                minIndex = i;
                min = nums[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<minIndex; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        int ans = minIndex+1;
        int newMax = max;
        for(int i=minIndex; i<nums.length; i++){
            if(newMax < nums[i]){
                newMax = nums[i];
            }
            if(max > nums[i]){
                ans = i+1;
                max = newMax;
            }
        }
        return ans;
    }
}