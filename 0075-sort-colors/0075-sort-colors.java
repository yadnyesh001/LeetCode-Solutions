class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                count0++;
            }
            if(nums[i] == 1){
                count1++;
            }
            if(nums[i] == 2){
                count2++;
            }
        }
        int i=0;
        for(i=0; i<count0; i++){
            nums[i] = 0;
        }
        for(i=count0; i<count1+count0; i++){
            nums[i] = 1;
        }
        for(i=count1+count0; i<count0+count1+count2; i++){
            nums[i] = 2;
        }
    }
}