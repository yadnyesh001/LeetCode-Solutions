class Solution {
    public int maxProduct(int[] nums) {
        int prod = 1;
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            prod = 1;
            for(int j=0; j<i+1; j++){
                prod = prod * nums[j];
            }
            if(max < prod){
                max = prod;
            }
        }
        return max;
    }
}