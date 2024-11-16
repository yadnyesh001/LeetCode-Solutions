class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int arr[] = new int[nums.length-k+1];
        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }
        for(int i=0; i<arr.length; i++){
            int count = 0;
            int key = nums[0];
            for(int j=i; j<i+k-1; j++){
                if(nums[j]+1 == nums[j+1]){
                    count = 0;
                }
                else{
                    count = 1;
                    break;
                }
                key = nums[j+1];
            }
            if(count == 0){
                arr[i] = key;
            }
        }
        return arr;
    }
}