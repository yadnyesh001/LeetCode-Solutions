class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int count = 0;
        int arr[] = new int[n];
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                count++;
            }
        }
        if(count > 1){
            return arr;
        }
        if(count == 1){
            int prod = 1;
            for(int i=0; i<n; i++){
                if(nums[i] != 0){
                    prod = prod * nums[i];
                }
            }
            for(int i=0; i<n; i++){
                if(nums[i] == 0){
                    arr[i] = prod;
                }
            }
        }
        else{
            int prod = 1;
            for(int i=0; i<n; i++){
                if(nums[i] != 0){
                    prod = prod * nums[i];
                }
            }
            for(int i=0; i<n; i++){
                arr[i] = prod/nums[i];

            }
        }
        return arr;
    }
}