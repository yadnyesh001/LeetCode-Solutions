class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = nums[0];
        int n = nums.length; 
        int arr[] = new int[n];
        int idx = 1;
        arr[0] = nums[0];
        for(int i=1; i<n; i++){
            if(curr == nums[i]){
                continue;
            }
            else{
                nums[idx++] = nums[i];
                curr = nums[i];
            }
        }
        return idx;
    }
}