class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n = nums.length;
        long sum = 0;
        for(int i=0; i<k; i++){
            if(mul == 0){
                sum = sum + (long)nums[n-i-1];
            }
            else{
                sum = sum + (long)(mul) * (long)nums[n-i-1];
                mul--;
            }
            System.out.println(sum);
        }
        return sum;
    }
}