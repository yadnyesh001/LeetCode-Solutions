class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i + nums[i] < 0){
                arr[i] = nums[((i + nums[i]) % nums.length + nums.length) % nums.length];
            }
            else{
                arr[i] = nums[(i+nums[i])%nums.length];
            }
        }
        return arr;
    }
}