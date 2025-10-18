class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length-k+1;
        int arr[] = new int[n];
        int res[] = new int[101];
        for(int i=0; i<k; i++){
            res[nums[i]+50]++;
        }
        int y = 0;
        for(int i=k; i<=nums.length; i++){
            int count = 0;
            int beauty = 0;
            for(int j=0; j<50; j++){
                if(res[j] > 0){
                    count = count + res[j];
                }
                if(count >= x){
                    beauty = j - 50;
                    break;
                }
            }
            arr[y++] = beauty;
            if (i < nums.length) {
                res[nums[i - k] + 50]--;
                res[nums[i] + 50]++;
            }
        }
        return arr;
    }
}