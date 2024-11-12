class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int max = (int)Math.pow(2, maximumBit)-1;
        int arr[] = new int[nums.length];
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum ^ nums[i];
        }
        int backsum = 0;
        for(int i=0; i<nums.length; i++){
            arr[i] = sum ^ backsum ^ max;
            backsum = backsum ^ nums[nums.length-i-1];
        }
        return arr;
    }
}