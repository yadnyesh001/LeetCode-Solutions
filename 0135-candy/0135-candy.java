class Solution {
    public int candy(int[] ratings) {
        int[] nums = new int[ratings.length];
        nums[0] = 1;
        for (int i = 0; i < ratings.length - 1; i++) {
            nums[i + 1] = 1;
            if (ratings[i] > ratings[i + 1] && nums[i] <= nums[i + 1]) {
                nums[i] = nums[i + 1] + 1;
            } else if (ratings[i] < ratings[i + 1] && nums[i] >= nums[i + 1]) {
                nums[i + 1] = nums[i] + 1;
            }
        }
        for (int i = ratings.length - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i] && nums[i - 1] <= nums[i]) {
                nums[i - 1] = nums[i] + 1;
            }
        }
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}