class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero = 0;
        int total = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }
            else{
                total = total * nums[i];
            }
        }
        int n = nums.length;
        int arr[] = new int[n];
        if(zero > 1){
            Arrays.fill(arr, 0);
        }
        else if(zero == 1){
            for(int i=0; i<nums.length; i++){
                if(nums[i] == 0){
                    arr[i] = total;
                }
            }
        }
        else{
            for(int i=0; i<nums.length; i++){
                arr[i] = total/nums[i];
            }
        }
        return arr;
    }
}