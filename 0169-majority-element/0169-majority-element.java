class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int elem = nums[0];
        for(int i=1; i<nums.length; i++){
            if(elem == nums[i]){
                count++;
            }
            else if(count > 0){
                count--;
            }
            else if(count == 0){
                elem = nums[i];
                count = 1;
            }
        }
        return elem;
    }
}