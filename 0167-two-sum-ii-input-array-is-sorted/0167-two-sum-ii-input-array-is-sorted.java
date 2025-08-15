class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                arr[0] = left + 1;
                arr[1] = right + 1;
                break;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return arr;
    }
}