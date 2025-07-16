class Solution {
    public int maximumLength(int[] nums) {
        int max = 0;
        int count = 0;
        int x = 0;
        int even = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0){
                even++;
            }
            if(x == 0 && nums[i] % 2 == 1){
                count++;
                x++;
            }
            if(x == 1 && nums[i] % 2 == 0){
                count++;
                x--;
            }
            max = Math.max(max, count);
        }
        max = Math.max(max, even);
        count = 0;
        x = 1;
        int odd = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 1){
                odd++;
            }
            if(x == 0 && nums[i] % 2 == 1){
                count++;
                x++;
            }
            if(x == 1 && nums[i] % 2 == 0){
                count++;
                x--;
            }
            max = Math.max(max, count);
        }
        max = Math.max(max, odd);
        return max;
    }
}