class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            int x = nums[i];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            while(x > 0){
                int m = x % 10;
                max = Math.max(max, m);
                min = Math.min(min, m);
                x = x/10;
            }
            arr[i] = max - min;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == max){
                sum = sum + nums[i];
            }
        }
        return sum;
    }
}