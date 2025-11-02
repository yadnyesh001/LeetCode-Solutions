class Solution {
    public long maxProduct(int[] nums) {
        int l = nums.length;
        long[] arr = new long[l];
        for (int i = 0; i < l; i++) {
            arr[i] = Math.abs(nums[i]);
        }
        Arrays.sort(arr);
        long max = arr[l - 1];
        long rep = 100000;
        long max2 = arr[l - 2];
        return max * max2 * rep;
    }
}