class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        int pivot = -1;
        int current = 0;
        for(int i=0; i<nums.length; i++){
            if(current == sum - nums[i] - current){
                pivot = i;
                break;
            }
            else{
                current = current + nums[i];
            }
        }
        return pivot;
    }
}