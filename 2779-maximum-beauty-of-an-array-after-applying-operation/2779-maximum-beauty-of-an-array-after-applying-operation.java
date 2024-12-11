class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int max = 0;
        for(int i=0; i<nums.length-1; i++){
            int start = i+1;
            int end = nums.length-1;
            while(start <= end){
                int mid = start + (end-start)/2;
                if(nums[mid] - nums[i] <= 2*k){
                    max = Math.max(max, mid-i);
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return max+1;
    }
}