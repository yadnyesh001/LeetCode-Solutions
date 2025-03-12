class Solution {
    public int maximumCount(int[] nums) {
        int neg = 0;
        int pos = 0;
        int start = 0, end = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= 0) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        neg = start;
        
        start = 0;
        end = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > 0) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        pos = nums.length-start;
        return Math.max(pos, neg);
    }
}