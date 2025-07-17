class Solution {
    public int maximumLength(int[] nums, int k) {
        int arr[] = new int[k];
        for(int i=0; i<nums.length-k; i++){
            int sum = 0;
            for(int j=i; j<k+i; j++){
                sum = sum + nums[j];
            }
            arr[sum % k]++;
        }
        int max = -1;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        if(max % 2 == 1){
            return max*2 - 1;
        }
        return max*2;
    }
}