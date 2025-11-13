class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                ans = nums[i];
            }
            sum = sum + nums[i];
        }
        int arr[] = new int[2];
        arr[0] = ans;
        arr[1] = nums.length*(nums.length+1)/2 -sum + ans;
        return arr;
    }
}