class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left = 0, right = 0, sum = 0, max = 0;
        Set<Integer> set = new HashSet<>();
        while (right < nums.length) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            sum += nums[right];
            max = Math.max(max, sum);
            right++;
        }

        return max;
    }
}
